package com.basho.contact.mr;

import com.basho.contact.Constants;
import com.basho.contact.Constants.MRLang;
import com.basho.contact.Constants.MRPhaseType;

public class MRPhase {
    private String content;
    private Constants.MRLang lang;
    private Constants.MRPhaseType phaseType;
    private boolean keep = true;


    public MRPhase(String content, MRLang lang, MRPhaseType phaseType,
                   boolean keep) {
        super();
        this.content = content;
        this.lang = lang;
        this.phaseType = phaseType;
        this.keep = keep;
    }


    public String toString() {
        return "MR: " + phaseType.toString() + ", " + lang.toString() + ", " + this.keep + ":" + content;
    }

    public boolean isKeep() {
        return keep;
    }


    public void setKeep(boolean keep) {
        this.keep = keep;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Constants.MRLang getLang() {
        return lang;
    }

    public void setLang(Constants.MRLang lang) {
        this.lang = lang;
    }

    public Constants.MRPhaseType getPhaseType() {
        return phaseType;
    }

    public void setPhaseType(Constants.MRPhaseType phaseType) {
        this.phaseType = phaseType;
    }

}
