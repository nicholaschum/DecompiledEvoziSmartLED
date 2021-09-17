package p021wl.smartled.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p010v7.app.AppCompatActivity;
import android.support.p010v7.app.C0241p;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import com.qihoo360.replugin.library.C0462R;
import java.util.ArrayList;
import java.util.List;
import p021wl.smartled.adapter.C0501a;
import p021wl.smartled.beans.DeviceBean;
import p021wl.smartled.p024c.C0528a;

/* renamed from: wl.smartled.activity.DevicePickActivity */
public class DevicePickActivity extends AppCompatActivity implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public List<DeviceBean> f2058a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<DeviceBean> f2059b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0501a f2060c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0501a f2061d;

    /* renamed from: e */
    private ListView f2062e;

    /* renamed from: f */
    private ListView f2063f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f2064g;

    /* renamed from: h */
    private ImageView f2065h;

    /* renamed from: a */
    static /* synthetic */ List m1598a(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            if (((Boolean) list2.get(i)).booleanValue()) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    public void onClick(View view) {
        if (this.f2060c.mo4814b() + this.f2061d.mo4814b() > 0) {
            new C0241p(this).mo3316a(17301569).mo3322a((CharSequence) C0528a.m1795a().mo4940d().get(this.f2064g).mo4903b()).mo3326b((CharSequence) getString(C0462R.string.string_save_to_group)).mo3323a((CharSequence) getString(17039379), (DialogInterface.OnClickListener) new C0479b(this)).mo3327b(getString(17039360), new C0478a(this)).mo3329d();
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0462R.layout.activity_newgroup);
        this.f2065h = (ImageView) findViewById(C0462R.C0464id.id_iv_back);
        this.f2062e = (ListView) findViewById(C0462R.C0464id.id_lv_nearby_devices);
        this.f2063f = (ListView) findViewById(C0462R.C0464id.id_lv_recent_devices);
        this.f2059b = C0528a.m1795a().mo4940d().get(0).mo4905c();
        this.f2058a = C0528a.m1795a().mo4940d().get(1).mo4905c();
        this.f2060c = new C0501a(this, this.f2058a);
        this.f2061d = new C0501a(this, this.f2059b);
        this.f2062e.setAdapter(this.f2061d);
        this.f2063f.setAdapter(this.f2060c);
        this.f2065h.setOnClickListener(this);
        this.f2059b.size();
        this.f2058a.size();
        this.f2064g = getIntent().getIntExtra("wl.extra.group.index", -1);
    }
}
