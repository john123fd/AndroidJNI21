
#include "zhanghuan_cn_jintest_MainActivity.h"

JNIEXPORT jstring JNICALL Java_zhanghuan_cn_jintest_MainActivity_getStringFromNative
        (JNIEnv * env, jobject obj) {
    return (*env)->NewStringUTF(env, "wo my gad From JNI !");
}
