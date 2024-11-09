package com.leetcode;

import com.leetcode.data.ListNode;
import org.junit.jupiter.api.Test;

import static com.leetcode.data.ListNode.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class AddTwoNumbersTest {

    final AddTwoNumbers it = new AddTwoNumbers();

    @Test
    void test0() {
        assertThat(number(0)).isEqualTo(listOf(0));
        assertThat(number(9)).isEqualTo(listOf(9));
        assertThat(number(100)).isEqualTo(listOf(0, 0, 1));
        assertThat(number(12345)).isEqualTo(listOf(5, 4, 3, 2, 1));
    }

    @Test
    void test1() {
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807
        assertThat(it.addTwoNumbers(number(342), number(465)))
                .isEqualTo(number(807));
    }

    @Test
    void test2() {
//        Input: l1 = [0], l2 = [0]
//        Output: [0]
//        Explanation: 0 + 0 = 0
        assertThat(it.addTwoNumbers(number(0), number(0)))
                .isEqualTo(number(0));

    }

    @Test
    void test3() {
//        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        Output: [8,9,9,9,0,0,0,1]
//        Explanation: 9_999_999 + 9_999 = 10_009_998
        assertThat(it.addTwoNumbers(number(9999999), number(9999)))
                .isEqualTo(number(10009998));
    }

    @Test
    void test4() {
//        Input: l1 = [2,4,9], l2 = [5,6,4,9]
//        Output: [7,0,4,0,1]
//        Explanation: 942 + 9_465 = 10_407
        assertThat(it.addTwoNumbers(number(942), number(9_465)))
                .isEqualTo(number(10_407));
    }

    private ListNode number(int num) {
        if (num == 0) {
            return new ListNode(0);
        }
        var result = new ListNode(num % 10);
        num /= 10;
        var current = result;

        while (num > 0) {
            var node = new ListNode(num % 10);
            current.next = node;
            current = node;
            num /= 10;
        }

        return result;
    }
}