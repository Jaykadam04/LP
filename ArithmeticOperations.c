#include <jni.h>
#include "ArithmeticOperations.h"

// Function to add two integers
JNIEXPORT jint JNICALL Java_ArithmeticOperations_add(JNIEnv *env, jobject obj, jint a, jint b) {
    return a + b;  // Return the sum of a and b
}

// Function to subtract one integer from another
JNIEXPORT jint JNICALL Java_ArithmeticOperations_subtract(JNIEnv *env, jobject obj, jint a, jint b) {
    return a - b;  // Return the difference of a and b
}

// Function to multiply two integers
JNIEXPORT jint JNICALL Java_ArithmeticOperations_multiply(JNIEnv *env, jobject obj, jint a, jint b) {
    return a * b;  // Return the product of a and b
}

// Function to divide one integer by another
JNIEXPORT jint JNICALL Java_ArithmeticOperations_divide(JNIEnv *env, jobject obj, jint a, jint b) {
    if (b == 0) {
        return 0; // Handle division by zero (returns 0)
    }
    return a / b;  // Return the quotient of a and b
}

