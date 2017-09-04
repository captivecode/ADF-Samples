package cc.bean;

import javax.el.ELContext;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

public class RequestBean {

    public BackingBean getBackingBean() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        ELContext context = fctx.getELContext();
        BackingBean backingBean =
            (BackingBean) fctx.getApplication().getExpressionFactory()
                .createValueExpression(context,"#{backingBeanScope.BackingBean}",BackingBean.class).getValue(context);
        return backingBean;
    }

    public void enableSubmit() {
        /* Invoke BackingBean method to enable/disable Submit Button */
        System.out.print("In RequestBean...");
        getBackingBean().getSubmitBtn().setDisabled(false);
    }
}
