package P1;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Class AppStore contains information about two different categories of apps - approved apps,
and apps currently under review, for approval and addition to the app store. Approved apps
are stored into a map, where the app represents the key, and the number of downloads,
represented as an Integer is the corresponding value.
 */
public class AppStore {

  private Map<MobileApp, Integer> approvedApps;
  private List<MobileApp> appsUnderReview;

  public AppStore(Map<MobileApp, Integer> approvedApps, List<MobileApp> appsUnderReview) {
    this.approvedApps = approvedApps;
    this.appsUnderReview = appsUnderReview;
  }

  public Map<MobileApp, Integer> getApprovedApps() {
    return approvedApps;
  }

  public List<MobileApp> getAppsUnderReview() {
    return appsUnderReview;
  }

  /**
   * Method takes in a category and a requestDate, filter the stream to only approved apps which is under the category of
   * requestedCategory and also released after the requestedDate, and return the MobileApp as a List
   * @param requestedCategory - the app Category we will be looking at
   * @param requestedDate - the requestDate we will be looking at
   * @return List<Mobile> that meets the criteria
   */
  public List<MobileApp> mysteryMethod(MobileAppCategory requestedCategory, LocalDate requestedDate){
    return this.approvedApps.keySet().stream().filter(x -> x.getAppCategory().equals(requestedCategory))
        .filter(y -> y.getDateOfOriginalRelease().isAfter(requestedDate)).collect(Collectors.toList());
  }

  /**
   * Return a list of all mobile apps currently under review that are requesting at most the number of permissions defined
   * by the input, and that are not requesting any of the permissions provided as input arguments
   * @param maxNumPermissions - the max number of permissions
   * @param permission1 - the permission that app can't request
   * @param permission2 - the second permission that app can't request
   * @return a List<MobileApp> that meet the requirement
   */
  public List<MobileApp> filterByRequestedPermissions(Integer maxNumPermissions, String permission1,
                                                       String permission2){
    //YOUR CODE HERE
    return this.appsUnderReview.stream().filter(x -> lessThanMax(x, maxNumPermissions)).
            filter(y-> excludePermission(y, permission1, permission2)).collect((Collectors.toList()));
  }

  /**
   * Helper method to determine if an app has at most maximum number of permission
   * @param app - the app we are looking at
   * @param max - the max number of permission
   * @return - true if the app has at most max number of request
   */
  private boolean lessThanMax(MobileApp app, int max){
    return app.getRequestedPermissions().size() <= max;
  }

  /**
   * Helper method to determine if the app has any permissions that are provided in the arguments
   * @param app - the app we are looking at
   * @param permission1 - the first permission we want to exclude
   * @param permission2 - the second permission we want to exclude
   * @return true if the app does not has these two permissions
   */
  private boolean excludePermission(MobileApp app, String permission1, String permission2){
    for(String permission: app.getRequestedPermissions()){
      if(permission.equals(permission1) || permission.equals(permission2)){
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof AppStore)) return false;
    AppStore appStore = (AppStore) o;
    return Objects.equals(getApprovedApps(), appStore.getApprovedApps()) &&
        Objects.equals(getAppsUnderReview(), appStore.getAppsUnderReview());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getApprovedApps(), getAppsUnderReview());
  }

  @Override
  public String toString() {
    return "AppStore{" +
        "approvedApps=" + approvedApps +
        ", appsUnderReview=" + appsUnderReview +
        '}';
  }
}
