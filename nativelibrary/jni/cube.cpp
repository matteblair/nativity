//
// Created by Matt Blair on 12/19/16.
//

#include <jni.h>

extern "C" {

    jint Java_com_mapzen_nativelibrary_Cuber_cube(JNIEnv*, jobject, jint number) {
        return number * number * number;
    }

}
