package first.sai.appd

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import first.sai.appd.adapters.WeatherModel

class MainVM : ViewModel() {

    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}