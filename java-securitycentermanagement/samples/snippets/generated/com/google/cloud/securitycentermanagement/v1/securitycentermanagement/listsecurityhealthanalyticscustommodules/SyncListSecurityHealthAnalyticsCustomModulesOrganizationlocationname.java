/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.securitycentermanagement.v1.samples;

// [START securitycentermanagement_v1_generated_SecurityCenterManagement_ListSecurityHealthAnalyticsCustomModules_Organizationlocationname_sync]
import com.google.cloud.securitycentermanagement.v1.OrganizationLocationName;
import com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient;
import com.google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule;

public class SyncListSecurityHealthAnalyticsCustomModulesOrganizationlocationname {

  public static void main(String[] args) throws Exception {
    syncListSecurityHealthAnalyticsCustomModulesOrganizationlocationname();
  }

  public static void syncListSecurityHealthAnalyticsCustomModulesOrganizationlocationname()
      throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SecurityCenterManagementClient securityCenterManagementClient =
        SecurityCenterManagementClient.create()) {
      OrganizationLocationName parent = OrganizationLocationName.of("[ORGANIZATION]", "[LOCATION]");
      for (SecurityHealthAnalyticsCustomModule element :
          securityCenterManagementClient
              .listSecurityHealthAnalyticsCustomModules(parent)
              .iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END securitycentermanagement_v1_generated_SecurityCenterManagement_ListSecurityHealthAnalyticsCustomModules_Organizationlocationname_sync]
