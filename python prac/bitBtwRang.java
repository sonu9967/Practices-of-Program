// Java program to find bit-wise & of all numbers from x to y.
import java.util.*;
class bitBtwRang {
// Function to find Bit-wise & of along numbers from x to y
    static long andOperator(long x, long y) {
//         // Initialize result as the first number
        long res = x;
      for (long i = x + 1; i <= y; i++) {          // Traverse from x+1 to y
            res = res & i;
        }
    return res;
    }
        // Driver code
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first value: ");
        long x=sc.nextLong();
        System.out.println("Enter the Second value: ");
        long y=sc.nextLong();
        System.out.print(andOperator(x, y));
    }
}







































// Bitwise AND of Numbers Range
// Author
// Ishita Chawla
// 0 upvotes
// Share
// Introduction
// Bitwise Algorithms are used to carry out operations at the bit level or manipulate bits in various ways. Bitwise operations are substantially faster and are sometimes utilized to increase a program's efficiency.

// It's occasionally vital to think about data at the bit level, and we'll have to work with each data bit individually. We may also need to use binary operators to switch on/off individual data bits and make our task more manageable. To conduct operations and alter data bits conveniently.

// In this blog, we will discuss the problem, Bitwise AND of Numbers Range, which can be easily solved using the basic concepts of bit manipulation.

// Problem Statement
// You are given two integers, L and R, representing the range of numbers from left to right. You have to find the bitwise AND of all the numbers in this range, including L and R.

// So basically we need to find the value of L & (L + 1) & (L + 2) & ….& (R - 2) & (R - 1) & R.

// Sample Example
// 1. Consider this case where L=5 and R=7; here, the result of AND of the numbers in the range [5,7] would be 4.

// 2. Now, let us consider a case where L=11 and R=14. Here the AND value of the numbers in this range would be 8.

// Brute Force Approach
// Algorithm
// The naive approach would be to traverse all the numbers from left to right, compute the AND, and subsequently store it as we proceed. 

// Implementation in C++
// // C++ program to find the bitwise AND of number's range.
// #include <bits/stdc++.h>
// using namespace std;

// // Function to find the bitwise AND of numbers between left and right.
// int findANDofRange(int left, int right)
// {
//     int answer = left;
//     for (int i = left + 1; i <= right; i++)
//     {
//         answer = answer & i;
//     }
//     return answer;
// }
// int main()
// {
//     long long int x=8, y=12;

//     // Calling the function to print the answer.
//     cout << "The bitwise and of the numbers in this range is " << findANDofRange(x, y);

//     return 0;
// }
// You can also try this code with Online C++ Compiler
// Run Code
 

// Output

// The bitwise AND of the numbers in this range is 8.

// Time Complexity

// The time complexity is O(N), where N is the count of numbers in the given range (R-L+1).

// Space Complexity

// The space complexity is O(1).

// We are not using any extra space, so the space complexity is constant, i.e., O(1).

// Bit Manipulation (Considering Rightmost Set Bit)
// Though the brute force approach might seem easy, this approach will not give A.C. (Accepted) due to the high constraints. So we will be using the optimal approach to solve this problem. In this approach, we will use the concept of the Rightmost Set Bit in the Bit Manipulation.

// Algorithm
// 1. For every pair of continuous numbers, the last bit differs from the previous one (one is always 0, and the other is always 1 because continuous numbers form an even-odd pair or vice-versa). Hence, until both numbers are not equal, the resultant bitwise AND of the rightmost bit is always zero.

// 2. So we check if the bits of L is equal to that of R.

// 3.  If they are not equal, we right-shift our numbers, removing the rightmost bit from them.

// 4. We keep a count of the number of shifts, say COUNT.

// 5. If the numbers are equal, we multiply 2COUNT with the remaining number. 

// 6. This gives us the required answer.

// Let’s try to understand this with the help of an example:

// Dry Run
// Let us consider the range as [9,15] here L=9 and R=15,

// Step-1

// Step-2

// Since L!=R so, we right shift both the numbers by 1 (i.e, we remove the last bit) and the COUNT will be increased.

// Step-3 

// Again, L!=R (4!=7), so again, we right-shift the numbers by 1, and the COUNT is increased by 1.

// Step-4 

// Repeat the above step since L!=R, 

// After performing the above step, L becomes equal to R. So now, COUNT becomes 3.

// Now we will multiply the remaining number (i.e. 1) with 2COUNT, so now our answer becomes 23  which is 8.

// Implementation in C++
// // C++ program to find the bitwise AND of the number's range.
// #include <iostream>
// using namespace std;

// // Function to find the bitwise AND of numbers between left and right.
// int findANDofRange(int left, int right)
// {
//     int count = 0;

//     // The loop runs until 'LEFT' and 'RIGHT' are unequal.
//     while (left != right)
//     {
//         // At every step, the numbers are shifted right, which means the rightmost bit is removed.
//         left >>= 1;
//         right >>= 1;
//         count++;
//     }

//     // The remaining bits are multiplied with the count of right shifts and this is the answer.
//     return right <<= count;
// }
// int main()
// {
//     long long int x=4, y=7;

//     // Calling the function to print the answer.
//     cout << "The bitwise AND of the numbers in this range is " << findANDofRange(x, y);

//     return 0;
// }
// You can also try this code with Online C++ Compiler
// Run Code
 

// Output

// The bitwise AND of the numbers in this range is 4.

// Time Complexity

// Since there are log(min(L, R)) bits in a number and we are going through all the bits one by one, the time complexity of this approach is O(log(min(L,R))).

// Space Complexity

// The space complexity is O(1), since we are not using any extra space so the space complexity is constant, i.e., O(1).

// Bit Manipulation (Considering Leftmost Set Bit)
// This approach is an alternative to the above approach, here we will be using the concept of Leftmost Set Bit of Bit manipulation to solve this question.

// Algorithm
// 1. We will first find the Leftmost set bit of both the numbers, L and R.

// 2. If the position of the Leftmost set bit differs, the result is 0 and we will return.

// 3. Else if the positions are the same, say LSB1, 2LSB1 is added to the answer, and it is subtracted from both L and R.

// 4. The above step will be repeated for the new values of L and R until the position of the Leftmost set bit differs. 

// Let us understand this with the help of an example 

// Dry Run
// Let us consider the range as [5,7] here L=5 and R=7, then initially,

// Step-1 

// Let the answer be ANS. 

// Position of MSB in L = 2 (5 = 1 0 1)

// Position of MSB in R = 2 (7 = 1 1 1)

// The position of MSB is the same, so ANS = ANS + 4  = 0 + 4 = 4

// L = 5 - 22 = 5 - 4 = 1

// R = 7 - 22 = 7 - 4 = 3

 

// Step-2

// Now the new L and R would be [1,3], again we will repeat the same process.

// Position of MSB in L = 0 (1 = 0 1)

// Position of MSB in R = 1 (3 = 1 1)

// The position of MSB differs, so the answer, ANS = ANS + 0 = 4 + 0 = 4

// So, the bitwise AND of Numbers Range in the range [5, 7] is 4.

// Implementation in C++
// // C++ program to find the bitwise AND of numbers range using bit manipulation.
// #include <iostream>
// using namespace std;

// // Function to find the position of the MSB in a number.
// int positionOfMSB(int n)
// {
//     int posOfMSB = -1;
//     while (n)
//     {
//         n = n >> 1;
//         posOfMSB++;
//     }
//     return posOfMSB;
// }

// // Function to find the bitwise AND of numbers between left and right.
// int findANDofRange(int left, int right)
// {
//     int ans = 0;

//     while (left && right)
//     {
//         // Finding the position of MSB on the 'LEFT' and 'RIGHT'.
//         int msb1 = positionOfMSB(left);
//         int msb2 = positionOfMSB(right);

//         // If the positions are not the same, return.
//         if (msb1 != msb2)
//             break;

//         // 2 ^ msb1 is added to the result and subtracted from both 'LEFT' and 'RIGHT'.
//         int msbVal = (1 << msb1);
//         ans = ans + msbVal;

//         left = left - msbVal;
//         right = right - msbVal;
//     }
//     return ans;
// }

// int main()
// {
//     long long int x=8, y=16;

//     // Calling the function to print the answer.
//     cout << "The bitwise and of the numbers in this range is " << findANDofRange(x, y);

//     return 0;
// }
// You can also try this code with Online C++ Compiler
// Run Code
 

// Output

// The bitwise AND of the numbers in this range is 0.
// Time Complexity

// The time complexity is given by O(log(L)), where ‘L’ is the minimum number.

// Since there are log(L) bits in a number and we are going through all the bits one by one, the time complexity of this approach is O(log(L)).

// Space Complexity

// The space complexity is O(1).

// We are not using any extra space so the space complexity is constant, i.e., O(1).

// Read about Bitwise Operators in C here.

// Also Read - Strong number in c

// Frequently Asked Questions
// What is C++?
// C++ is a general-purpose programming language created by Bjarne Stroustrup at Bell Labs in the early 1980s. C++ is quite similar to C, and it is so compatible with C that it can run 99 percent of C programs without changing any source code.

// List different arithmetic operators in C++.
// The different arithmetic operators are +,-,/,%,*.

// What is STL in C++?
// STL is an acronym for Standard Template Library that provide generic classes and functions in C++ that can be used to implement data structures.

// What does bitwise AND do?
// It takes two bits and gives output as 1 when both the bits are set to 1 else if either or both the bits are set to 0 then it gives output as 0.

// What is the garbage value in C and C++?
// When we allocate a variable, some memory for that variable is reserved. If a variable is declared but not allocated any value, it has a garbage value, which means that the computer's storage keeps any random data.