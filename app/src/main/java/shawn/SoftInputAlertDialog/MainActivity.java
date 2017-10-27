package shawn.SoftInputAlertDialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_commit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showEditDialog();
            }
        });
    }

    private void showEditDialog() {
        final EditText editText = (EditText) LayoutInflater.from(this).inflate(R.layout.edittext, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.dialog_soft_input).setView(editText);
        builder.setTitle("标题")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "确定", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        builder.show();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) editText.getLayoutParams();
        layoutParams.width = (int) (UIUtils.getScreenDisplay(this)[0] * 0.724);
        layoutParams.height = (int) (UIUtils.getScreenDisplay(this)[0] * 0.228);
        layoutParams.gravity = Gravity.CENTER;
    }
}
