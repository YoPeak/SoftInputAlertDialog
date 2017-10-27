package shawn.SoftInputAlertDialog;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

/**
 * Created by Shawn on 2016/3/28.
 */
public class UIUtils {
    /**
     * 获取屏幕宽高
     * @return
     */
    public static int[] getScreenDisplay(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return new int[]{point.x, point.y};
    }
}
