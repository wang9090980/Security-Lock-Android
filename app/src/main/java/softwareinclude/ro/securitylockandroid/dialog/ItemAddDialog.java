package softwareinclude.ro.securitylockandroid.dialog;

import android.app.Dialog;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import softwareinclude.ro.securitylockandroid.R;

/**
 * Created by Sebastian Manolescu on 20.08.2014.
 */
public class ItemAddDialog extends Dialog implements View.OnClickListener{

    private Context context;
    private Button cancelAdd;
    private Button doneAdd;
    private EditText accountItemName;
    private EditText accountItemPassword;
    private EditText detailsItemInput;
    private ImageButton addDetailsItem;
    private LinearLayout addDetailsLayout;


    public ItemAddDialog(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.add_item_dialog);

        initUI();
        initData();
    }

    private void initUI(){

        cancelAdd = (Button) findViewById(R.id.cancelAdd);
        cancelAdd.setOnClickListener(this);
        doneAdd = (Button) findViewById(R.id.doneAdd);
        doneAdd.setOnClickListener(this);

        accountItemName = (EditText) findViewById(R.id.accountItemName);
        accountItemPassword = (EditText) findViewById(R.id.accountItemPassword);
        detailsItemInput = (EditText) findViewById(R.id.detailsItemInput);

        addDetailsItem = (ImageButton) findViewById(R.id.addDetailsItem);
        addDetailsItem.setOnClickListener(this);

        addDetailsLayout = (LinearLayout) findViewById(R.id.addDetailsLayout);

    }

    private void initData() {
        detailsItemInput.setVisibility(View.GONE);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.cancelAdd: {
                dismiss();
                break;
            }

            case R.id.doneAdd: {
                dismiss();
                break;
            }

            case R.id.addDetailsItem: {
                addDetailsLayout.setVisibility(View.GONE);
                detailsItemInput.setVisibility(View.VISIBLE);
                break;
            }

            default: {
                break;
            }
        }
    }
}
