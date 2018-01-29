package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.MessageContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.MessageModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.message.MessageActivity;

/**
 * Created by yw on 2018/1/19.
 */

public class MessagePresenterImpl extends BasePresenter<MessageModelImpl, MessageActivity> implements MessageContract.MessagePresenter {
    @Override
    public void getMessages() {
        model.loadMessages(view);
    }
}
