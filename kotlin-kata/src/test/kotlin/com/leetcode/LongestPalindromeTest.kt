package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LongestPalindromeTest {

    private val it: LongestPalindrome = LongestPalindrome()

    @Test
    fun test1() {
//        Input: s = "abccccdd"
//        Output: 7
//        Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

        assertThat(it.longestPalindrome("abccccdd"))
            .isEqualTo(7)
    }

    @Test
    fun test2() {
//        Input: s = "a"
//        Output: 1
//        Explanation: The longest palindrome that can be built is "a", whose length is 1.

        assertThat(it.longestPalindrome("a"))
            .isEqualTo(1)
    }

    @Test
    fun test3() {
//        Input: s = "Aa"
//        Output: 1
//        Explanation: Letters are case sensitive, for example, "Aa" is not considered a palindrome.

        assertThat(it.longestPalindrome("Aa"))
            .isEqualTo(1)
    }

    @Test
    fun test4() {
        assertThat(it.longestPalindrome("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez"))
            .isEqualTo(55)
    }

    @Test
    fun test5() {
        assertThat(
            it.longestPalindrome(
                "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"
            )
        )
            .isEqualTo(983)
    }
}