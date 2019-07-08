package itboy.mylibrary;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

public class ServiceService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("yqy", "onCreate");
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }


    private class MyBinder extends IMyAidlInterface.Stub {
        public MyBinder() {
            Log.e("yqy", "MyBinder");
        }

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public String getString() throws RemoteException {
            return "我是服务器";
        }
    }

}
