# ID Card and Passport NFC Reader

Uygulamanın ana mantığı mrz içerisindeki 3 bilginin servise verilmesi ile pasaport ve ya kimlik içerisindeki nfc ile haberleşmesini sağlamaktadır.
## İstenilen bilgiler.
*	Belge no
*	Dogum tarihi
*	Belgenin geçerlilik tarihi

## Kullanılan Kutuphaneler: 
* [JMRTD](https://jmrtd.org/about.shtml) - Java implementation of the Machine Readable Travel Document
* [SCUBA](http://scuba.sourceforge.net/)

## Uygulamanın gerçekleştirdikleri:
* NFC iletişimini kurar
* Önceden girilen pasaport numarası, doğum tarihi ve son kullanma tarihi (belgenin geçerlilik tarihi) kullanarak pasaportun kimliğini doğrular.
* Passport ve kimlik veri gruplarını okur - fotoğraf da dahil olmak üzere pasaportta bulunan tüm kişisel bilgiler.

```
InputStream is = ps.getInputStream(PassportService.EF_DG1);
DG1File dg1 = (DG1File) LDSFileUtil.getLDSFile(PassportService.EF_DG1, is);

```
* Kimlik doğrulaması gerçekleştirir - çipin klonlanmamasını sağlayan EAC'nin ilk adımıdır - çipin korunan alanında saklanan özel bir anahtarın sahipliğinin kanıtını gerektirir.

* [Daha fazla bilgi için](http://techblog.bozho.net/electronic-machine-readable-travel-documents/)

**EF_DG1**
```
public static final short EF_DG1
File identifier for data group 1. Data group 1 contains the MRZ.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG1)

**EF_DG2**
```
public static final short EF_DG2
File identifier for data group 2. Data group 2 contains face image data.
```
See Also:
[Constant Field Values] (https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG2)


**EF_DG3**
```
public static final short EF_DG3
File identifier for data group 3. Data group 3 contains finger print data.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG3)


**EF_DG4**
```
public static final short EF_DG4
File identifier for data group 4. Data group 4 contains iris data.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG4)


**EF_DG5**
```
public static final short EF_DG5
File identifier for data group 5. Data group 5 contains displayed portrait. Person Photo
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG5)


**EF_DG6**
```
public static final short EF_DG6
File identifier for data group 6. Data group 6 is RFU.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG6)


**EF_DG7**
```
public static final short EF_DG7
File identifier for data group 7. Data group 7 contains displayed signature.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG7)


**EF_DG8**
```
public static final short EF_DG8
File identifier for data group 8. Data group 8 contains data features.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG8)


**EF_DG9**
```
public static final short EF_DG9
File identifier for data group 9. Data group 9 contains structure features.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG9)


**EF_DG10**
```
public static final short EF_DG10
File identifier for data group 10. Data group 10 contains substance features.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG10)



**EF_DG11**
```
public static final short EF_DG11
File identifier for data group 11. Data group 11 contains additional personal details.

1.	Name of Holder (Primary and Secondary Identifiers, in full)
2.	Other Name(s)
3.	Personal Number
4.	Place of Birth
5.	Date of Birth (in full)
6.	Address
7.	Telephone Number(s)
8.	Profession
9.	Title
10.	Personal Summary
11.	Proof of Citizenship 
12.	Number of Other Valid Travel Documents
13.	Other Travel Document Numbers
14.	Custody Information
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG11)


**EF_DG12**
```
public static final short EF_DG12
File identifier for data group 12. Data group 12 contains additional document details.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG12)


**EF_DG13**
```
public static final short EF_DG13
File identifier for data group 13. Data group 13 contains optional details.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG13)


**EF_DG14**
```
public static final short EF_DG14
File identifier for data group 14. Data group 14 contains security infos.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG14)


**EF_DG15**
```
public static final short EF_DG15
File identifier for data group 15. Data group 15 contains the public key used for Active Authentication.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG15)


**EF_DG165**
```
public static final short EF_DG16
File identifier for data group 16. Data group 16 contains person(s) to notify.
```
See Also:
[Constant Field Values](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/constant-values.html#org.jmrtd.PassportService.EF_DG16)



- [Daha fazla bilgi için](https://static.javadoc.io/org.jmrtd/jmrtd/0.6.7/org/jmrtd/lds/LDSFile.html) - EF_DG1.....EF_DG15 class yapıları

## Örnek çağırım:

```java
public class MainActivity extends AppCompatActivity {

    ...

     @Override
    public void onNewIntent(Intent intent) {
        if (NfcAdapter.ACTION_TECH_DISCOVERED.equals(intent.getAction())) {

            Tag tag = intent.getExtras().getParcelable(NfcAdapter.EXTRA_TAG);

            if (Arrays.asList(tag.getTechList()).contains("android.nfc.tech.IsoDep")) {

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
                String passportNumber = preferences.getString(KEY_PASSPORT_NUMBER, null);
                String expirationDate = convertDate(preferences.getString(KEY_EXPIRATION_DATE, null));
                String birthDate = convertDate(preferences.getString(KEY_BIRTH_DATE, null));

                if (passportNumber != null && !passportNumber.isEmpty()
                        && expirationDate != null && !expirationDate.isEmpty()
                        && birthDate != null && !birthDate.isEmpty()) {
                    BACKeySpec bacKey = new BACKey(passportNumber, birthDate, expirationDate);
                    new ReadTask(IsoDep.get(tag), bacKey).execute();
                    mainLayout.setVisibility(View.GONE);
                    loadingLayout.setVisibility(View.VISIBLE);
                } else {
                    Snackbar.make(passportNumberView, R.string.error_input, Snackbar.LENGTH_SHORT).show();
                }
            }
        }
    }

    ...

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            String name = data.getStringExtra("firstName") + " " + data.getStringExtra("lastName");
            ...
        }
    }

	 @Override
        protected Exception doInBackground(Void... params) {
            try {

                CardService cardService = CardService.getInstance(isoDep);
                cardService.open();

                PassportService service = new PassportService(cardService);
                service.open();

                boolean paceSucceeded = false;
                try {
                    CardAccessFile cardAccessFile = new CardAccessFile(service.getInputStream(PassportService.EF_CARD_ACCESS));
                    Collection<PACEInfo> paceInfos = cardAccessFile.getPACEInfos();
                    if (paceInfos != null && paceInfos.size() > 0) {
                        PACEInfo paceInfo = paceInfos.iterator().next();
                        service.doPACE(bacKey, paceInfo.getObjectIdentifier(), PACEInfo.toParameterSpec(paceInfo.getParameterId()));
                        paceSucceeded = true;
                    } else {
                        paceSucceeded = true;
                    }
                } catch (Exception e) {
                    Log.w(TAG, e);
                }

                service.sendSelectApplet(paceSucceeded);

                if (!paceSucceeded) {
                    try {
                        service.getInputStream(PassportService.EF_COM).read();
                    } catch (Exception e) {
                        service.doBAC(bacKey);
                    }
                }

                LDS lds = new LDS();

                CardFileInputStream dg11In = service.getInputStream(PassportService.EF_DG11);
                lds.add(PassportService.EF_DG11, dg11In, dg11In.getLength());
                dg11File = lds.getDG11File();

                CardFileInputStream dg1In = service.getInputStream(PassportService.EF_DG1);
                lds.add(PassportService.EF_DG1, dg1In, dg1In.getLength());
                dg1File = lds.getDG1File();

                CardFileInputStream dg2In = service.getInputStream(PassportService.EF_DG2);
                lds.add(PassportService.EF_DG2, dg2In, dg2In.getLength());
                dg2File = lds.getDG2File();

                List<FaceImageInfo> allFaceImageInfos = new ArrayList<>();
                List<FaceInfo> faceInfos = dg2File.getFaceInfos();
                for (FaceInfo faceInfo : faceInfos) {
                    allFaceImageInfos.addAll(faceInfo.getFaceImageInfos());
                }

                if (!allFaceImageInfos.isEmpty()) {
                    FaceImageInfo faceImageInfo = allFaceImageInfos.iterator().next();

                    int imageLength = faceImageInfo.getImageLength();
                    DataInputStream dataInputStream = new DataInputStream(faceImageInfo.getImageInputStream());
                    byte[] buffer = new byte[imageLength];
                    dataInputStream.readFully(buffer, 0, imageLength);
                    InputStream inputStream = new ByteArrayInputStream(buffer, 0, imageLength);

                    bitmap = ImageUtil.decodeImage(
                            MainActivity.this, faceImageInfo.getMimeType(), inputStream);

                }

            } catch (Exception e) {
                return e;
            }
            return null;
        }
    ...

}

```

## Dependencies

Note that the app includes following third party dependencies:

- JMRTD - [LGPL 3.0 License](https://www.gnu.org/licenses/lgpl-3.0.en.html)
- SCUBA (Smart Card Utils) - [LGPL 3.0 License](https://www.gnu.org/licenses/lgpl-3.0.en.html)
- Spongy Castle - MIT-based [Bouncy Castle Licence](https://www.bouncycastle.org/licence.html)
- Unidata Jj2000 - [Apache 2.0 License](https://www.apache.org/licenses/LICENSE-2.0)
- JNBIS - [Apache 2.0 License](https://www.apache.org/licenses/LICENSE-2.0)
- Material DateTimepicker - [Apache 2.0 License](https://www.apache.org/licenses/LICENSE-2.0)
