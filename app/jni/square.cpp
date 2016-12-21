//
// Created by Matt Blair on 5/20/16.
//

#include <jni.h>

extern "C" {

    jint Java_com_mapzen_nativity_MainActivity_square(JNIEnv*, jobject, jint number) {
        return number * number;
    }

}
