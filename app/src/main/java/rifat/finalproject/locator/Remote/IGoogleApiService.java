package rifat.finalproject.locator.Remote;

import retrofit2.Call;
import retrofit2.http.Url;
import rifat.finalproject.locator.Model.MyPlaces;

public interface IGoogleApiService {

    Call<MyPlaces>getNearByPlaces(@Url String url);
}
