package shopping.gd.com.yw.gdshoppingmail.presenter;

import java.util.List;

import shopping.gd.com.yw.domain.model.Message;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

/**
 * Created by yw on 2018/1/19.
 */

public class MessageContract {

    public interface MessageView extends BaseContract.IBaseView {
        void messageShow(List<Message> list);
    }

    public interface MessagePresenter extends BaseContract.IBasePresenter {
        void getMessages();
    }

    public interface MessageModel extends BaseContract.IBaseModule {
        void loadMessages(MessageView view);
    }
}
