package cc.bean;

import oracle.adf.view.rich.component.rich.nav.RichButton;

public class BackingBean {
    private RichButton submitBtn;

    public void setSubmitBtn(RichButton submitBtn) {
        this.submitBtn = submitBtn;
    }

    public RichButton getSubmitBtn() {
        return submitBtn;
    }
}
