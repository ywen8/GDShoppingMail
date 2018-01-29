package shopping.gd.com.yw.gdshoppingmail.base;

public class BasePresenter<M extends BaseModule, V extends BaseContract.IBaseView> {

    public M model;

    public V view;

    public void attatchWindow(M m, V v) {
        this.model = m;
        this.view = v;
    }

    public void detachWindow() {
        this.model = null;
        this.view = null;
    }
}
