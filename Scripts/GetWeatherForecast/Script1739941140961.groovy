import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

// Gunakan koordinat Jakarta Selatan:  -6.2607 (latitude), 106.7986 (longitude)
String weatherUrl = "https://api.openweathermap.org/data/2.5/forecast?lat=-6.2607&lon=106.7986&appid=0b215a44e815a6f78a915202cf1243f0"

// Buat request object
RequestObject weatherRequest = new RequestObject("weatherRequest")
weatherRequest.setRestUrl(weatherUrl)
weatherRequest.setRestRequestMethod("GET")

// Kirim request dan dapatkan respons
ResponseObject response = WS.sendRequest(weatherRequest)

// Verifikasi status kode harus 200 (OK)
WS.verifyResponseStatusCode(response, 200)

// Ambil nilai deskripsi cuaca dari respons
String actualValue = WS.getElementPropertyValue(response, "list[0].weather[0].description")

// Log untuk debugging
println("Actual weather description: " + actualValue)

// Pastikan deskripsi cuaca tidak kosong atau null agar menghindari error
assert actualValue != null && actualValue.trim().length() > 0 : "Weather description is empty!"