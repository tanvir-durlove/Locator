package rifat.finalproject.locator;

import rifat.finalproject.locator.Remote.IGoogleApiService;
import rifat.finalproject.locator.Remote.RetrofitClient;

public class Common {
    public static final String GOOGLE_API_URL ="https://maps.googleapis.com/";
    public static IGoogleApiService getGoogleAPIServices()
    {
        return RetrofitClient.geClient(GOOGLE_API_URL).create(IGoogleApiService.class);
    }
}
