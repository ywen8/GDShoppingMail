package shopping.gd.com.yw.gdshoppingmail.ui.activity.message;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.domain.model.Message;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.MessageContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.MessagePresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.MessageModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.MessageAdapter;

/**
 * Created by yw on 2018/1/19.
 */

public class MessageActivity extends BaseActivity<MessagePresenterImpl> implements MessageContract.MessageView {

    @BindView(R.id.activity_message_rv)
    RecyclerView message_rv;
    MessageAdapter adapter;

    @Override
    public void messageShow(List<Message> list) {
        message_rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MessageAdapter(this, list);
        message_rv.setAdapter(adapter);
    }

    @Override
    protected MessagePresenterImpl initPresent() {
        return new MessagePresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new MessageModelImpl();
    }

    @Override
    protected void onResume() {
        super.onResume();
        present.getMessages();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }
}
