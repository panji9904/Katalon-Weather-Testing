import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

// URL untuk data polusi udara Jakarta Selatan
String pollutionUrl = "https://api.openweathermap.org/data/2.5/air_pollution?lat=-6.2615&lon=106.8106&appid=0b215a44e815a6f78a915202cf1243f0"

// Buat HTTP Request
RequestObject pollutionRequest = new RequestObject("pollutionRequest")
pollutionRequest.setRestUrl(pollutionUrl)
pollutionRequest.setRestRequestMethod("GET")

// Kirim request dan ambil response
def response = WS.sendRequest(pollutionRequest)

// Validasi status code harus 200
WS.verifyResponseStatusCode(response, 200)

// Ambil nilai AQI dari response
def aqi = WS.getElementPropertyValue(response, "list[0].main.aqi")

// Pastikan AQI ada dalam rentang 1-5
assert (aqi >= 1 && aqi <= 5) : "AQI tidak dalam rentang 1-5. Nilai yang diterima: ${aqi}"

println("Test sukses! AQI Jakarta Selatan: ${aqi}")