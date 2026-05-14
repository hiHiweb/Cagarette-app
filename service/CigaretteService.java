package com.example.cigarette.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.cigarette.model.AssessmentForm;

@Service
public class CigaretteService {

    public String calculateResult(AssessmentForm form) {
        int marlbr = 0, amsprz = 0, blkdvl = 0, glbat = 0, 
            echo = 0, cnk = 0, piani = 0, mevius = 0;

        if ("yes".equals(form.getQ1())) { marlbr++; glbat++; mevius++; piani++; }
        if ("yes".equals(form.getQ2())) { blkdvl++; glbat += 5; cnk++; piani++; }
        if ("yes".equals(form.getQ3())) { glbat++; cnk++; mevius += 5; }
        if ("yes".equals(form.getQ4())) { blkdvl++; piani += 5; mevius++; }
        if ("yes".equals(form.getQ5())) { marlbr++; echo++; }
        if ("yes".equals(form.getQ6())) { amsprz++; cnk += 5; }
        if ("yes".equals(form.getQ7())) { marlbr += 5; amsprz++; }
        if ("yes".equals(form.getQ8())) { echo += 5; piani++; amsprz++; }
        if ("yes".equals(form.getQ9())) { amsprz += 5; echo++; }
        if ("yes".equals(form.getQ10())) { blkdvl += 5; }

        Map<String, Integer> scores = new HashMap<>();
        scores.put("マルボロ赤", marlbr);
        scores.put("ナチュラルアメリカンスピリット・ライト", amsprz);
        scores.put("ブラックデビル オリジナル", blkdvl);
        scores.put("ゴールデンバット", glbat);
        scores.put("echo", echo);
        scores.put("中南海", cnk);
        scores.put("ピアニッシモ・アリア・メンソール1mm", piani);
        scores.put("メビウス5", mevius);

        return scores.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("判定不能");
    }
}