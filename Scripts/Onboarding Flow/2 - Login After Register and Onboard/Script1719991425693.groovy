import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('remit.pazemo.dev')

WebUI.setText(findTestObject('Object Repository/Login/inputEmail'), 'testt@grr.la', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Login/inputPassword'), 'Test123$')

WebUI.click(findTestObject('Object Repository/Login/btnLogin'))

//Navigate to Onboarding Form
//WebUI.navigateToUrl("https://remit.pazemo.dev/partner/account/onboarding/business")
// Input onboarding form - step 1
// business type 
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseBusinessType'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'PT']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'PT']))

// brand name
WebUI.setText(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/inputBrandName'), 'Mawar', FailureHandling.STOP_ON_FAILURE)

// business industry
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseBusinessIndustry'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Layanan Keuangan']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Layanan Keuangan']))

// NPWP Company
WebUI.setText(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/inputNPWPCompany'), '1234567890123456', FailureHandling.STOP_ON_FAILURE)

// NPWP Company Name
WebUI.setText(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/inputNPWPCompanyName'), 'PT Test Apa Aja', 
    FailureHandling.STOP_ON_FAILURE)

// Tax Info - Country
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseTaxCountry'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Indonesia']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Indonesia']))

// Tax Info - Province
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseTaxProvince'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'DKI Jakarta']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'DKI Jakarta']))

// Tax Info - City
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseTaxCity'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']))

// Tax Info - District
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseTaxDistrict'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Menteng']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Menteng']))

// Tax Info - Address
WebUI.setText(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/inputTaxAddress'), 'Jalan Menteng Dalam nomor 15', 
    FailureHandling.STOP_ON_FAILURE)

// Tax Info - Postal Code
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseTaxPostalCode'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : '10330']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : '10330']))

// Business Info - Country
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseBizCountry'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Indonesia']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Indonesia']))

// Business Info - Province
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseBizProvince'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'DKI Jakarta']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'DKI Jakarta']))

// Business Info - City
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseBizCity'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']))

// Business Info - District
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseBizDistrict'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Menteng']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : 'Menteng']))

// Business Info - Address
WebUI.setText(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/inputBizAddress'), 'Jalan Menteng Dalam nomor 15', 
    FailureHandling.STOP_ON_FAILURE)

// Business Info - Postal Code
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/chooseBizPostalCode'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : '10330']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/option', [('optionName') : '10330']))

// Lanjut
WebUI.click(findTestObject('Object Repository/Onboarding/step_1_info_bisnis/btnLanjut'))

// Input onboarding form - step 2
// step2 | Tambah Pengurus - 1
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/btnTambahPengurus1'))

// Tambah Pengurus | Form Pengurus ke - 1
// Form | 1. Info Profil
// Input Full Name
WebUI.setText(findTestObject('Object Repository/Onboarding/step_2_pengurus/info_profil/inputFullName'), 'Bambang Mawardi')

// Choose Gender
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/info_profil/chooseGender'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Pria']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Pria']))

// Input Phone Number
WebUI.setText(findTestObject('Object Repository/Onboarding/step_2_pengurus/info_profil/inputPhoneNumber'), '081290576943')

// Input NIK
WebUI.setText(findTestObject('Object Repository/Onboarding/step_2_pengurus/info_profil/inputNIK'), '1234567890123456')

// Input Place of Birth
WebUI.setText(findTestObject('Object Repository/Onboarding/step_2_pengurus/info_profil/inputBirthPlace'), 'Jakarta')

// Input Date of Birth
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/info_profil/clickBirthDate'))

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/info_profil/pickBtnBirthDate'))

// Input Rank
WebUI.setText(findTestObject('Object Repository/Onboarding/step_2_pengurus/info_profil/inputRank'), 'Direktur Utama')

// Choose Marital Status
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/info_profil/chooseMaritalStatus'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Lajang']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Lajang']))

// Form | 2. Alamat Pengurus - sesuai KTP
// Choose Country
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_ktp/chooseCountry'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Indonesia']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Indonesia']))

// Choose Province
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_ktp/chooseProvince'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'DKI Jakarta']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'DKI Jakarta']))

// Choose City
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_ktp/chooseCity'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']))

// Choose District
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_ktp/chooseDistrict'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Menteng']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Menteng']))

// Input Address
WebUI.setText(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_ktp/inputAddress'), 'Jalan Menteng Dalam nomor 15', 
    FailureHandling.STOP_ON_FAILURE)

// Choose Postal Code
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_ktp/choosePostalCode'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : '10330']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : '10330']))

// Form | 3. Alamat Pengurus saat ini 
// Click toggle or not
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_current/clickToggle'))

// Choose Country
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_current/chooseCountry'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Indonesia']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Indonesia']))

// Choose Province
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_current/chooseProvince'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'DKI Jakarta']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'DKI Jakarta']))

// Choose City
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_current/chooseCity'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']))

// Choose District
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_current/chooseDistrict'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Menteng']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : 'Menteng']))

// Input Address
WebUI.setText(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_current/inputAddress'), 'Jalan Menteng Dalam nomor 15', 
    FailureHandling.STOP_ON_FAILURE)

// Choose Postal Code
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/alamat_pengurus_current/choosePostalCode'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : '10330']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/option', [('optionName') : '10330']))

// Form | 4. Legal Document
// Upload Nomor Pokok Wajib Pajak Pengurus
// remove 'display: none' 
//WebUI.executeJavaScript("document.getElementById('npwpFile').style.display='block';", null)
// upload file
WebUI.uploadFile(findTestObject('Object Repository/Onboarding/step_2_pengurus/dokumen_legal/npwpFile'), 'C:\\Users\\Lenovo\\Downloads\\uploadFile.png')

WebUI.uploadFile(findTestObject('Object Repository/Onboarding/step_2_pengurus/dokumen_legal/ktpFile'), 'C:\\Users\\Lenovo\\Downloads\\uploadFile_1.png')

// Click Simpan Pengurus
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/savePengurus'))

// Wait for 5 seconds after clicking
WebUI.delay(5)

//Click Next
WebUI.click(findTestObject('Object Repository/Onboarding/step_2_pengurus/btnNext'))

// Wait for 5 seconds after clicking
WebUI.delay(5)

// Input onboarding form - step 3
// step3 | form PIC
// Form | 1.Info Profil
// Choose Gender
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/info_profil/chooseGender'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Pria']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Pria']))

// Input NIK
WebUI.setText(findTestObject('Object Repository/Onboarding/step_3_pic/info_profil/inputNIK'), '1234567890123456')

// Input Place of Birth
WebUI.setText(findTestObject('Object Repository/Onboarding/step_3_pic/info_profil/inputBirthPlace'), 'Jakarta')

// Input Date of Birth
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/info_profil/clickBirthDate'))

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/info_profil/pickBtnBirthDate'))

// Input Rank
WebUI.setText(findTestObject('Object Repository/Onboarding/step_3_pic/info_profil/inputRank'), 'Direktur Utama')

// Choose Marital Status
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/info_profil/chooseMaritalStatus'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Lajang']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Lajang']))

// Form | 2. Alamat Pic - sesuai KTP
// Choose Country
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_ktp/chooseCountry'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Indonesia']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Indonesia']))

// Choose Province
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_ktp/chooseProvince'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'DKI Jakarta']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'DKI Jakarta']))

// Choose City
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_ktp/chooseCity'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']))

// Choose District
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_ktp/chooseDistrict'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Menteng']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Menteng']))

// Input Address
WebUI.setText(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_ktp/inputAddress'), 'Jalan Menteng Dalam nomor 15', 
    FailureHandling.STOP_ON_FAILURE)

// Choose Postal Code
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_ktp/choosePostalCode'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : '10330']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : '10330']))

// Form | 3. Alamat Pic saat ini
// Click toggle or not
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_current/clickToggle'))

// Choose Country
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_current/chooseCountry'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Indonesia']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Indonesia']))

// Choose Province
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_current/chooseProvince'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'DKI Jakarta']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'DKI Jakarta']))

// Choose City
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_current/chooseCity'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Kota Administrasi Jakarta Pusat']))

// Choose District
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_current/chooseDistrict'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Menteng']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : 'Menteng']))

// Input Address
WebUI.setText(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_current/inputAddress'), 'Jalan Menteng Dalam nomor 15', 
    FailureHandling.STOP_ON_FAILURE)

// Choose Postal Code
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/alamat_pengurus_current/choosePostalCode'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : '10330']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/option', [('optionName') : '10330']))

// Form | 4. Legal Document
// upload file
WebUI.uploadFile(findTestObject('Object Repository/Onboarding/step_3_pic/dokumen_legal/npwpFile'), 'C:\\Users\\Lenovo\\Downloads\\uploadFile.png')

WebUI.uploadFile(findTestObject('Object Repository/Onboarding/step_3_pic/dokumen_legal/ktpFile'), 'C:\\Users\\Lenovo\\Downloads\\uploadFile_1.png')

WebUI.uploadFile(findTestObject('Object Repository/Onboarding/step_3_pic/dokumen_legal/selfieFile'), 'C:\\Users\\Lenovo\\Downloads\\uploadFile_2.png')

// click Lanjut
//Click Next
WebUI.click(findTestObject('Object Repository/Onboarding/step_3_pic/clickBtnNext'))

// Input onboarding form - step 4
// step 4 | info Bank Settlement
// Choose Bank
WebUI.click(findTestObject('Object Repository/Onboarding/step_4_info_bank/chooseBank'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Onboarding/step_4_info_bank/option', [('optionName') : 'Demo Bank']), 
    10)

WebUI.click(findTestObject('Object Repository/Onboarding/step_4_info_bank/option', [('optionName') : 'Demo Bank']))

// Input Branch
WebUI.setText(findTestObject('Object Repository/Onboarding/step_4_info_bank/inputBranch'), 'KCP Alsut', FailureHandling.STOP_ON_FAILURE)

// Input Account Number
WebUI.setText(findTestObject('Object Repository/Onboarding/step_4_info_bank/inputAccNumber'), '74937292', FailureHandling.STOP_ON_FAILURE)

// Check Account Number
WebUI.click(findTestObject('Object Repository/Onboarding/step_4_info_bank/clickBtnCheck'))

// Wait a bit
WebUI.delay(3)

// Click Lanjut
WebUI.click(findTestObject('Object Repository/Onboarding/step_4_info_bank/clickBtnLanjut'))

// Wait a bit
WebUI.delay(3)

// Onboarding - step 5
// Upload Dokumen Legal
// Nomor Pokok Wajib Pajak Perusahaan
WebUI.uploadFile(findTestObject('Object Repository/Onboarding/step_5_dokumen_legal/businessNpwpFile'), 'C:\\Users\\Lenovo\\Downloads\\uploadFile.pdf')

// Anggaran Dasar + SK Kemenkumham
WebUI.uploadFile(findTestObject('Object Repository/Onboarding/step_5_dokumen_legal/articleAssociationFile'), 'C:\\Users\\Lenovo\\Downloads\\uploadFile_1.pdf')

// Halaman Pertama Buku Tabungan Bisnis
WebUI.uploadFile(findTestObject('Object Repository/Onboarding/step_5_dokumen_legal/businessPassbookFile'), 'C:\\Users\\Lenovo\\Downloads\\uploadFile_2.pdf')

// Nomor Registrasi Bisnis/Usaha
WebUI.uploadFile(findTestObject('Object Repository/Onboarding/step_5_dokumen_legal/businessRegNumberFile'), 'C:\\Users\\Lenovo\\Downloads\\uploadFile_3.pdf')

// Selesai
WebUI.click(findTestObject('Object Repository/Onboarding/step_5_dokumen_legal/Selesai'))

