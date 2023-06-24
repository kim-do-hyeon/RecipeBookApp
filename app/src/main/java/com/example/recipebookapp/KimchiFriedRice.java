package com.example.recipebookapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KimchiFriedRice extends AppCompatActivity {

    private Button purchaseButton1;
    private Button purchaseButton2;
    private Button purchaseButton3;
    private Button purchaseButton4;
    private Button purchaseButton5;
    private Button purchaseButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kimchi_fried_rice);

        // 레이아웃에서 PurchaseButton1 버튼 찾기
        purchaseButton1 = findViewById(R.id.PurchaseButton1);
        purchaseButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.coupang.com/vp/products/7156372428?itemId=18001981793&vendorItemId=85413914134&src=1139000&spec=10799999&addtag=460&ctag=7156372428&lptag=AF0831180&itime=20230624234405&pageType=MLSDP&pageValue=7156372428&wPcid=24238430765722632682228&wRef=www.10000recipe.com&wTime=20230624234405&redirect=landing&traceid=V0-153-04a47786899a452d&mcid=a747c9e6667f4f3badb0a63956d79d88&placementid=&clickBeacon=cyMXv6FdaqFphpyc4W9cgQatv5JShCPeTL0V9YSkG532l5PfonHLfnLPJV4%2BojuxHmyS3th%2FhxUV%2Be0rz7oLoD2nCEDOjfMfu8rlTj86KH5gvkLDQdD9nl1fwr4lIoJCzYZ5J%2BBWKVUmdNvem8yS0p8gjeMQbJvN7nUG%2F8AK%2FWRg%2BR%2B7QALiuhnsIW52XoiihhBb47VUyg5aADEcAdzRxbOWDG2pnVN5wRPXTAu05%2BNmyntOdS04FAVXS9%2FrtT%2BhwaFOkvm8I1XT%2BYFBk%2FoYmOMBNhfBzxQ7F0rX0Y9XQakYfLRmL1Zk3ZWVVMT6m6LfJ7kzkaxhcCKuO6vKknLf97hN56IGeOop%2BQPMv58kbjCKx47ZSFEhA%2BfYibRbXxfe9W4x2VfvdsQcdJsgt1BvI126dovxCCTm44tfGZ0PWcNugCVlgyxQAa6FrdrwN6D5opq9ccT7i8861uP2A1QfPH42aVhPdNsO87Vn9iNfZL8ByMKMNjsqag4Uy%2FgJM%2BYn4Wad4aNHFYxQJR%2BcZ%2FIAjfzMzi0x7FhvagkTt5ULFpNJFs2zrWRm%2BORt3tbC7CrJcCMINhO%2BxTzHTgLdJ0%2FBNTFJhwdPzKCTyiz7i8zqSAwN86DYYxy0jzFojwuxCi7lt8uBcJE5IXhWlRXXmcyMVtoP9GExo3Tl%2Fm0TRgn%2B%2B1mJM8pKFr7YEz1GZid3payKPRQvUzwOCcI8I373Abzul1EV4dhF0yEcCS%2BY%2FtTHhYcJO7cdcV7c7JxVlFCn97b0IkWOT0jlb%2FpaN%2Bt3k08%2Fs1MPWsaVzTjiS%2FGfZofBnCLoaKXwDOWnfzXJK7Zw0LUcogydlKx2cxqDE4uIBVCidDS9mWKErl%2FIPlG6kZC5OVO0rJz9ku1u2Gckitf96LRY&campaignid=&contentcategory=&imgsize=&tsource=&pageid=&deviceid=&token=31850C%7CMIXED&contenttype=&subid=10000recipe12&impressionid=&campaigntype=&requestid=20230624234404616209424925&contentkeyword=&subparam=&isAddedCart=");
            }
        });

        // 레이아웃에서 PurchaseButton2 버튼 찾기
        purchaseButton2 = findViewById(R.id.PurchaseButton2);
        purchaseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.coupang.com/vp/products/2124428361?itemId=3604872297&vendorItemId=71590545406&src=1139000&spec=10799999&addtag=460&ctag=2124428361&lptag=AF0831180&itime=20230624234444&pageType=MLSDP&pageValue=2124428361&wPcid=24238430765722632682228&wRef=www.10000recipe.com&wTime=20230624234444&redirect=landing&traceid=V0-153-45725c4756be148a&mcid=33721bae454241b28a70674b5761b2f9&placementid=&clickBeacon=&campaignid=&contentcategory=&imgsize=&tsource=&pageid=&deviceid=&token=31850C%7CMIXED&contenttype=&subid=10000recipe12&impressionid=&campaigntype=&requestid=20230624234443870283002385&contentkeyword=&subparam=&isAddedCart=");
            }
        });

        // 레이아웃에서 PurchaseButton3 버튼 찾기
        purchaseButton3 = findViewById(R.id.PurchaseButton3);
        purchaseButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.coupang.com/vp/products/5932127779?itemId=10544118249&vendorItemId=77825606072&src=1139000&spec=10799999&addtag=460&ctag=5932127779&lptag=AF0831180&itime=20230624234453&pageType=MLSDP&pageValue=5932127779&wPcid=24238430765722632682228&wRef=www.10000recipe.com&wTime=20230624234453&redirect=landing&traceid=V0-153-a61fa16ca213b366&mcid=dd75eb703c2b4c52952a8a9928e560d5&placementid=&clickBeacon=&campaignid=&contentcategory=&imgsize=&tsource=&pageid=&deviceid=&token=31850C%7CMIXED&contenttype=&subid=10000recipe12&impressionid=&campaigntype=&requestid=20230624234452863317812765&contentkeyword=&subparam=&isAddedCart=");
            }
        });

        // 레이아웃에서 PurchaseButton4 버튼 찾기
        purchaseButton4 = findViewById(R.id.PurchaseButton4);
        purchaseButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("http://coupang.com/vp/products/6512226336?itemId=14388904066&vendorItemId=81633174910&src=1139000&spec=10799999&addtag=460&ctag=6512226336&lptag=AF0831180&itime=20230624234459&pageType=MLSDP&pageValue=6512226336&wPcid=24238430765722632682228&wRef=www.10000recipe.com&wTime=20230624234459&redirect=landing&traceid=V0-153-e54efb0dfda23884&mcid=42d01e81a5b143eba26847d3f82a23ce&placementid=&clickBeacon=&campaignid=&contentcategory=&imgsize=&tsource=&pageid=&deviceid=&token=31850C%7CMIXED&contenttype=&subid=10000recipe12&impressionid=&campaigntype=&requestid=20230624234459230183569511&contentkeyword=&subparam=");
            }
        });

        // 레이아웃에서 PurchaseButton5 버튼 찾기
        purchaseButton5 = findViewById(R.id.PurchaseButton5);
        purchaseButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.coupang.com/vp/products/6496339013?itemId=14499557735&vendorItemId=84994378243&src=1139000&spec=10799999&addtag=460&ctag=6496339013&lptag=AF0831180&itime=20230624234512&pageType=MLSDP&pageValue=6496339013&wPcid=24238430765722632682228&wRef=www.10000recipe.com&wTime=20230624234512&redirect=landing&traceid=V0-153-d8579be5ed9e4ecb&mcid=8b0b76591a964e33be96bc9090359ce4&placementid=&clickBeacon=&campaignid=&contentcategory=&imgsize=&tsource=&pageid=&deviceid=&token=31850C%7CMIXED&contenttype=&subid=10000recipe12&impressionid=&campaigntype=&requestid=20230624234512132241768470&contentkeyword=&subparam=&isAddedCart=");
            }
        });

        // 레이아웃에서 PurchaseButton6 버튼 찾기
        purchaseButton6 = findViewById(R.id.PurchaseButton6);
        purchaseButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.coupang.com/vp/products/1238142198?itemId=2233650974&vendorItemId=70231220837&src=1139000&spec=10799999&addtag=460&ctag=1238142198&lptag=AF0831180&itime=20230624234519&pageType=MLSDP&pageValue=1238142198&wPcid=24238430765722632682228&wRef=www.10000recipe.com&wTime=20230624234519&redirect=landing&traceid=V0-153-a3a6df86ba4940c6&mcid=1df23bb58e92414e981772efbf078a84&placementid=&clickBeacon=QG6Dp0Sk8IlyTvhuTVlZwK58sBMUiLtsGhp5aquMvNbvSnzHd%2B5lvz%2FOixTidoPtHmyS3th%2FhxUV%2Be0rz7oLoD2nCEDOjfMfu8rlTj86KH53h8%2BZ4ZPhLvUcWPxTFy4ZgVyX7f5235VlXjc2WkC3UbwsTQaVQ8z36NM1Pjlx64ipUPJsy6VPYzGv3kdHXHHJku90jNuc7uU4Ic17%2FSYBDLOWDG2pnVN5wRPXTAu05%2BNmyntOdS04FAVXS9%2FrtT%2Bhxz8p0l6nTRYx2jmZkHspqzgTf%2F3niffoS9TH%2FfL%2B5YRa1FfkkTImoGfEXb1Z9om%2BiLJ5Iq2Krn1Sljt8o4PKw3NQAvwN8PgmN8fsvI%2FLaN8Nd%2FamaGYHZSw7YLtDIWkPgj01T%2B9y%2B3xkS8VcWRjMHhrcrG1nHv5kCzSfxfkjEjUWcMoJIYlQHqoQ1NrFHgtTYKPKJgh0My1i0DgtUKavQLyskqmvWOqQj%2Fp3eBqHK%2BhaL%2BoRZnixl%2FhEbux7xmqk%2BEe%2F4gAtxuo46n8GOvcICM87ekDdhWQp%2F2Zg243yDyqE7g4VclU71AB3lHkOpQRIiRbMF3acIjumbvwFtXTFuFG2uVVqs82GAjwhF4OgOCYKL%2BktvDe%2B8%2BulX8np%2FHyo%2FRjzPoTZDA3dHNSdpt819jEvN0TLbg5DNRlt3uhX7U1q%2BrGKWqaNN20KlucKwR1skXNbj77c%2F%2BCqcOlO%2Bgvde1TDvUBYC0j7RZ8Aka21V2vJ44jpj%2FxFYLpw%2FdwlseKVuxCq0MoPSla6bkBp9xCTaSzfBfy2Urh4jTDg0On5%2BBD5b8TC7QVI%2B3rz9ktDpzUBW2sxMF5VFiwRB%2B1FlqrK4YCZ7B9tiI1%2Bni3UDM98fmd9LztOzHT%2FCFkS0OS%2F2%2B%2F4&campaignid=&contentcategory=&imgsize=&tsource=&pageid=&deviceid=&token=31850C%7CMIXED&contenttype=&subid=10000recipe12&impressionid=&campaigntype=&requestid=20230624234519600013528525&contentkeyword=&subparam=&isAddedCart=");
            }
        });
    }

    private void openLink(String url) {
        // 웹 브라우저를 열기 위한 인텐트 생성
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
}
