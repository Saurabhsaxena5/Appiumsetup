package NewProject.NewProject;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumService {
	
	private static AppiumDriverLocalService service;

    public static void startServer() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    public static void stopServer() {
        if (service != null) {
            service.stop();
        }
    }

}
