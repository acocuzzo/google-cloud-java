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

package com.google.cloud.security.privateca.v1.samples;

// [START privateca_v1_generated_CertificateAuthorityService_CreateCertificate_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.security.privateca.v1.CaPoolName;
import com.google.cloud.security.privateca.v1.Certificate;
import com.google.cloud.security.privateca.v1.CertificateAuthorityServiceClient;
import com.google.cloud.security.privateca.v1.CreateCertificateRequest;

public class AsyncCreateCertificate {

  public static void main(String[] args) throws Exception {
    asyncCreateCertificate();
  }

  public static void asyncCreateCertificate() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CertificateAuthorityServiceClient certificateAuthorityServiceClient =
        CertificateAuthorityServiceClient.create()) {
      CreateCertificateRequest request =
          CreateCertificateRequest.newBuilder()
              .setParent(CaPoolName.of("[PROJECT]", "[LOCATION]", "[CA_POOL]").toString())
              .setCertificateId("certificateId-644529902")
              .setCertificate(Certificate.newBuilder().build())
              .setRequestId("requestId693933066")
              .setValidateOnly(true)
              .setIssuingCertificateAuthorityId("issuingCertificateAuthorityId-559908707")
              .build();
      ApiFuture<Certificate> future =
          certificateAuthorityServiceClient.createCertificateCallable().futureCall(request);
      // Do something.
      Certificate response = future.get();
    }
  }
}
// [END privateca_v1_generated_CertificateAuthorityService_CreateCertificate_async]
