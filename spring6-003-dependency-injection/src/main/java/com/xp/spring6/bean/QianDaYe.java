package com.xp.spring6.bean;

import java.util.Arrays;

/**
 * @author 苏禾
 * @version 1.0
 * @title QianDaYe
 * @description <TODO description class purpose>
 * @create 2023/7/19 21:48
 * @since 1.0
 **/
public class QianDaYe {
    private String[] aiHaos;
    private Woman[] women;

    @Override
    public String toString() {
        return "QianDaYe{" +
                "aiHaos=" + Arrays.toString(aiHaos) +
                ", women=" + Arrays.toString(women) +
                '}';
    }

    public void setWomen(Woman[] women) {
        this.women = women;
    }

    public void setAiHaos(String[] aiHaos) {
        this.aiHaos = aiHaos;
    }
}
