package com.qihoo360.replugin.model;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.qihoo360.replugin.C0457d;
import com.qihoo360.replugin.RePlugin;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import library.C0470c;
import org.json.JSONException;
import org.json.JSONObject;

public class PluginInfo implements Parcelable, Serializable, Cloneable {
    public static final int ADAPTER_CURRENT_VERSION = 12;
    public static final Parcelable.Creator<PluginInfo> CREATOR = new Parcelable.Creator<PluginInfo>() {
        /* renamed from: a */
        public final PluginInfo createFromParcel(Parcel parcel) {
            return new PluginInfo(parcel);
        }

        /* renamed from: a */
        public final PluginInfo[] newArray(int i) {
            return new PluginInfo[i];
        }
    };
    public static final int FRAMEWORK_VERSION_UNKNOWN = 0;
    public static final String LOCAL_PLUGIN_DATA_SUB_DIR = "plugins_v3_data";
    public static final int TYPE_BUILTIN = 2;
    public static final int TYPE_EXTRACTED = 11;
    public static final int TYPE_NOT_INSTALL = 10;
    public static final int TYPE_PN_INSTALLED = 1;
    public static final int TYPE_PN_JAR = 3;

    /* renamed from: a */
    private transient JSONObject f2041a;

    /* renamed from: b */
    private String f2042b;

    /* renamed from: c */
    private PluginInfo f2043c;

    /* renamed from: d */
    private PluginInfo f2044d;

    /* renamed from: e */
    private PluginInfo f2045e;

    /* renamed from: f */
    private boolean f2046f;

    /* renamed from: g */
    private PluginInfo f2047g;

    /* renamed from: com.qihoo360.replugin.model.PluginInfo$a */
    class C0467a {

        /* renamed from: a */
        private static final byte[] f2048a = new byte[0];

        /* renamed from: b */
        private static volatile Boolean f2049b;

        /* renamed from: a */
        public static boolean m1581a() {
            if (f2049b != null) {
                return f2049b.booleanValue();
            }
            synchronized (f2048a) {
                if (f2049b != null) {
                    boolean booleanValue = f2049b.booleanValue();
                    return booleanValue;
                }
                Boolean valueOf = Boolean.valueOf(m1583c());
                f2049b = valueOf;
                boolean booleanValue2 = valueOf.booleanValue();
                return booleanValue2;
            }
        }

        /* renamed from: b */
        public static String m1582b() {
            return m1581a() ? "arm64" : "arm";
        }

        /* renamed from: c */
        private static boolean m1583c() {
            Class<?> cls;
            Method declaredMethod;
            Object invoke;
            Method declaredMethod2;
            try {
                if (Build.VERSION.SDK_INT < 21 || (cls = Class.forName("dalvik.system.VMRuntime")) == null || (declaredMethod = cls.getDeclaredMethod("getRuntime", new Class[0])) == null || (invoke = declaredMethod.invoke((Object) null, new Object[0])) == null || (declaredMethod2 = cls.getDeclaredMethod("is64Bit", new Class[0])) == null) {
                    return false;
                }
                Object invoke2 = declaredMethod2.invoke(invoke, new Object[0]);
                if (invoke2 instanceof Boolean) {
                    return ((Boolean) invoke2).booleanValue();
                }
                return false;
            } catch (Throwable unused) {
            }
        }
    }

    private PluginInfo(Parcel parcel) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        m1578a(jSONObject);
    }

    private PluginInfo(JSONObject jSONObject) {
        m1578a(jSONObject);
    }

    /* renamed from: a */
    private File m1575a(File file, String str) {
        File file2 = new File(file, makeInstalledFileName() + str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }

    /* renamed from: a */
    private String m1576a() {
        return format(getName(), getLowInterfaceApi(), getHighInterfaceApi(), getVersion());
    }

    /* renamed from: a */
    private void m1577a(StringBuilder sb) {
        sb.append('<');
        sb.append(getName());
        sb.append(':');
        sb.append(getVersion());
        sb.append('(');
        sb.append(getFrameworkVersion());
        sb.append(')');
        sb.append("> ");
        if (this.f2047g != null) {
            sb.append("[HAS_PARENT] ");
        }
        sb.append(getType() == 2 ? "[BUILTIN] " : isPnPlugin() ? "[P-N] " : "[APK] ");
        if (isDexExtracted()) {
            sb.append("[DEX_EXTRACTED] ");
        }
        if (RePlugin.isPluginRunning(getName())) {
            sb.append("[RUNNING] ");
        }
        String[] runningProcessesByPlugin = RePlugin.getRunningProcessesByPlugin(getName());
        if (runningProcessesByPlugin != null) {
            sb.append("processes=");
            sb.append(Arrays.toString(runningProcessesByPlugin));
            sb.append(' ');
        }
        if (this.f2041a != null) {
            sb.append("js=");
            sb.append(this.f2041a);
            sb.append(' ');
        }
        sb.append("dex=");
        sb.append(getDexFile());
        sb.append(' ');
        sb.append("nlib=");
        sb.append(getNativeLibsDir());
    }

    /* renamed from: a */
    private void m1578a(JSONObject jSONObject) {
        this.f2041a = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject("upinfo");
        if (optJSONObject != null) {
            this.f2043c = new PluginInfo(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("delinfo");
        if (optJSONObject2 != null) {
            this.f2044d = new PluginInfo(optJSONObject2);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("coverinfo");
        if (optJSONObject3 != null) {
            this.f2045e = new PluginInfo(optJSONObject3);
        }
        this.f2046f = jSONObject.optBoolean("cover");
    }

    public static final String format(String str, int i, int i2, int i3) {
        return str + "-" + i + "-" + i2 + "-" + i3;
    }

    public Object clone() {
        PluginInfo pluginInfo;
        ClassNotFoundException e;
        IOException e2;
        JSONException e3;
        this.f2042b = this.f2041a != null ? this.f2041a.toString() : null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            pluginInfo = (PluginInfo) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
            if (pluginInfo != null) {
                try {
                    if (!TextUtils.isEmpty(this.f2042b)) {
                        pluginInfo.f2041a = new JSONObject(this.f2042b);
                        JSONObject optJSONObject = pluginInfo.f2041a.optJSONObject("upinfo");
                        if (optJSONObject != null) {
                            pluginInfo.f2043c = new PluginInfo(optJSONObject);
                        }
                        JSONObject optJSONObject2 = pluginInfo.f2041a.optJSONObject("delinfo");
                        if (optJSONObject2 != null) {
                            pluginInfo.f2044d = new PluginInfo(optJSONObject2);
                        }
                        JSONObject optJSONObject3 = pluginInfo.f2041a.optJSONObject("coverinfo");
                        if (optJSONObject3 != null) {
                            pluginInfo.f2045e = new PluginInfo(optJSONObject3);
                        }
                    }
                } catch (ClassNotFoundException e4) {
                    e = e4;
                    e.printStackTrace();
                    return pluginInfo;
                } catch (IOException e5) {
                    e2 = e5;
                    e2.printStackTrace();
                    return pluginInfo;
                } catch (JSONException e6) {
                    e3 = e6;
                    e3.printStackTrace();
                    return pluginInfo;
                }
            }
        } catch (ClassNotFoundException e7) {
            e = e7;
            pluginInfo = null;
            e.printStackTrace();
            return pluginInfo;
        } catch (IOException e8) {
            e2 = e8;
            pluginInfo = null;
            e2.printStackTrace();
            return pluginInfo;
        } catch (JSONException e9) {
            e3 = e9;
            pluginInfo = null;
            e3.printStackTrace();
            return pluginInfo;
        }
        return pluginInfo;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        try {
            return ((PluginInfo) obj).f2041a.toString().equals(this.f2041a.toString());
        } catch (Exception unused) {
            return false;
        }
    }

    public String getAlias() {
        return this.f2041a.optString("ali");
    }

    public String getApkDir() {
        return C0457d.m1524a().getDir(isPnPlugin() ? "plugins_v3" : getIsPendingCover() ? "p_c" : "p_a", 0).getAbsolutePath();
    }

    public File getApkFile() {
        String apkDir = getApkDir();
        return new File(apkDir, makeInstalledFileName() + ".jar");
    }

    public File getDexFile() {
        if (Build.VERSION.SDK_INT > 25) {
            File dexParentDir = getDexParentDir();
            return new File(dexParentDir, makeInstalledFileName() + ".odex");
        }
        File dexParentDir2 = getDexParentDir();
        return new File(dexParentDir2, makeInstalledFileName() + ".dex");
    }

    public File getDexParentDir() {
        Context a = C0457d.m1524a();
        if (Build.VERSION.SDK_INT <= 25) {
            return isPnPlugin() ? a.getDir("plugins_v3_odex", 0) : getIsPendingCover() ? a.getDir("p_c", 0) : a.getDir("p_od", 0);
        }
        return new File(getApkDir() + File.separator + "oat" + File.separator + C0467a.m1582b());
    }

    public File getExtraDexDir() {
        return m1575a(getDexParentDir(), "_ed");
    }

    public File getExtraOdexDir() {
        return m1575a(getDexParentDir(), "_eod");
    }

    public int getFrameworkVersion() {
        return this.f2041a.optInt("frm_ver", 0);
    }

    public int getHighInterfaceApi() {
        return this.f2041a.optInt("high", 10);
    }

    public boolean getIsPendingCover() {
        return this.f2046f;
    }

    public int getLowInterfaceApi() {
        return this.f2041a.optInt("low", 10);
    }

    public String getName() {
        return this.f2041a.optString("name");
    }

    public File getNativeLibsDir() {
        return new File(C0457d.m1524a().getDir(isPnPlugin() ? "plugins_v3_libs" : getIsPendingCover() ? "p_c" : "p_n", 0), makeInstalledFileName());
    }

    public String getPackageName() {
        return this.f2041a.optString("pkgname");
    }

    public PluginInfo getParentInfo() {
        return this.f2047g;
    }

    public String getPath() {
        return this.f2041a.optString("path");
    }

    public PluginInfo getPendingCover() {
        return this.f2045e;
    }

    public PluginInfo getPendingDelete() {
        return this.f2044d;
    }

    public PluginInfo getPendingUpdate() {
        return this.f2043c;
    }

    public int getType() {
        return this.f2041a.optInt("type");
    }

    public int getVersion() {
        return this.f2041a.optInt("ver");
    }

    public long getVersionValue() {
        return this.f2041a.optLong("verv");
    }

    public int hashCode() {
        return this.f2041a.hashCode();
    }

    public boolean isDexExtracted() {
        File dexFile = getDexFile();
        return dexFile.exists() && dexFile.length() > 0;
    }

    public boolean isNeedCover() {
        return this.f2045e != null;
    }

    public boolean isNeedUninstall() {
        return this.f2044d != null;
    }

    public boolean isNeedUpdate() {
        return this.f2043c != null;
    }

    public boolean isPnPlugin() {
        int type = getType();
        return type == 1 || type == 3 || type == 2;
    }

    public boolean isUsed() {
        return isPnPlugin() ? isDexExtracted() : getParentInfo() != null ? getParentInfo().isUsed() : this.f2041a.optBoolean("used");
    }

    public String makeInstalledFileName() {
        if (isPnPlugin() || getType() == 2) {
            return m1576a();
        }
        return Integer.toString((getPackageName().toLowerCase() + getLowInterfaceApi() + getHighInterfaceApi() + getVersion() + "ak").hashCode() - 88);
    }

    public void setFrameworkVersion(int i) {
        C0470c.m1585a(this.f2041a, "frm_ver", Integer.valueOf(i));
    }

    public void setIsUsed(boolean z) {
        C0470c.m1585a(this.f2041a, "used", Boolean.valueOf(z));
    }

    public void setPath(String str) {
        C0470c.m1585a(this.f2041a, "path", str);
    }

    public void setType(int i) {
        C0470c.m1585a(this.f2041a, "type", Integer.valueOf(i));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PInfo { ");
        m1577a(sb);
        sb.append(" }");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2041a.toString());
    }
}
