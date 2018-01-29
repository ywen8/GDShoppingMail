package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import java.util.ArrayList;
import java.util.List;

import shopping.gd.com.yw.domain.model.Message;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.MessageContract;

/**
 * Created by yw on 2018/1/19.
 */

public class MessageModelImpl extends BaseModule implements MessageContract.MessageModel {
    @Override
    public void loadMessages(MessageContract.MessageView view) {
        List<Message> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Message message = new Message();
            list.add(message);
        }
        view.messageShow(list);
    }
}
