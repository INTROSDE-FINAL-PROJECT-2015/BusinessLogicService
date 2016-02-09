package introsde.helper;

public class UriHelper{

	static final String storageServiceURL = "https://damp-spire-46715.herokuapp.com/sdelab/";
	static final String businessLogicURL  = "http://127.0.1.1:5900/sdelab/";

	public static String getStorageServicesURL() {
		return storageServiceURL;
	}

	public static String getBusinessLogicURL(){
		return businessLogicURL;
	}
}
