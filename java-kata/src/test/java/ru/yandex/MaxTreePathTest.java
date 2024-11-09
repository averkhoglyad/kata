package ru.yandex;

import org.junit.jupiter.api.Test;
import ru.yandex.MaxTreePath.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTreePathTest {

    final MaxTreePath it = new MaxTreePath();

//      1
    @Test
    void test0() {
        var root = new TreeNode(1);
        assertThat(it.getMaxPath(root))
                .isEqualTo(1);
    }

//      1
//     / \
//   -2   3
    @Test
    void test01() {
        var root = new TreeNode(1, new TreeNode(-2), new TreeNode(3));
        assertThat(it.getMaxPath(root))
                .isEqualTo(4);
    }

//      1
//     / \
//    2   -3
    @Test
    void test02() {
        var root = new TreeNode(1, new TreeNode(2), new TreeNode(-3));
        assertThat(it.getMaxPath(root))
                .isEqualTo(3);
    }

//     -1
//     / \
//    2   3
    @Test
    void test03() {
        var root = new TreeNode(-1, new TreeNode(2), new TreeNode(3));
        assertThat(it.getMaxPath(root))
                .isEqualTo(4);
    }

//     -10
//     /  \
//    2    3
    @Test
    void test04() {
        var root = new TreeNode(-10, new TreeNode(2), new TreeNode(3));
        assertThat(it.getMaxPath(root))
                .isEqualTo(3);
    }

//     -1
//     / \
//   -2  -3
    @Test
    void test05() {
        var root = new TreeNode(-1, new TreeNode(-2), new TreeNode(-3));
        assertThat(it.getMaxPath(root))
                .isEqualTo(-1);
    }

//      1
//     / \
//    2   3
    @Test
    void test1() {
        var root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertThat(it.getMaxPath(root))
                .isEqualTo(6);
    }

//      -10
//     /    \
//    9     20
//         /  \
//        15   7
    @Test
    void test2() {
        var root = new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertThat(it.getMaxPath(root))
                .isEqualTo(42);
    }

//      -10
//     /    \
//    1      20
//          /  \
//        15  -100
    @Test
    void test3() {
        var root = new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(-100)));
        assertThat(it.getMaxPath(root))
                .isEqualTo(35);
    }

//      10
//     /  \
//    2    3
//        / \
//       4   5
    @Test
    void test4() {
        var root = new TreeNode(10, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        assertThat(it.getMaxPath(root))
                .isEqualTo(20);
    }
}