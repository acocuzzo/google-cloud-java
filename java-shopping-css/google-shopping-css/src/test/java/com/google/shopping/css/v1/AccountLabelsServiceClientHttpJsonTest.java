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

package com.google.shopping.css.v1;

import static com.google.shopping.css.v1.AccountLabelsServiceClient.ListAccountLabelsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import com.google.shopping.css.v1.stub.HttpJsonAccountLabelsServiceStub;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class AccountLabelsServiceClientHttpJsonTest {
  private static MockHttpService mockService;
  private static AccountLabelsServiceClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonAccountLabelsServiceStub.getMethodDescriptors(),
            AccountLabelsServiceSettings.getDefaultEndpoint());
    AccountLabelsServiceSettings settings =
        AccountLabelsServiceSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                AccountLabelsServiceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AccountLabelsServiceClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void listAccountLabelsTest() throws Exception {
    AccountLabel responsesElement = AccountLabel.newBuilder().build();
    ListAccountLabelsResponse expectedResponse =
        ListAccountLabelsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAccountLabels(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    AccountName parent = AccountName.of("[ACCOUNT]");

    ListAccountLabelsPagedResponse pagedListResponse = client.listAccountLabels(parent);

    List<AccountLabel> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAccountLabelsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listAccountLabelsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      AccountName parent = AccountName.of("[ACCOUNT]");
      client.listAccountLabels(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAccountLabelsTest2() throws Exception {
    AccountLabel responsesElement = AccountLabel.newBuilder().build();
    ListAccountLabelsResponse expectedResponse =
        ListAccountLabelsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAccountLabels(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "accounts/account-4811";

    ListAccountLabelsPagedResponse pagedListResponse = client.listAccountLabels(parent);

    List<AccountLabel> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAccountLabelsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listAccountLabelsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "accounts/account-4811";
      client.listAccountLabels(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAccountLabelTest() throws Exception {
    AccountLabel expectedResponse =
        AccountLabel.newBuilder()
            .setName(AccountLabelName.of("[ACCOUNT]", "[LABEL]").toString())
            .setLabelId(-1959256506)
            .setAccountId(-803333011)
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .build();
    mockService.addResponse(expectedResponse);

    AccountName parent = AccountName.of("[ACCOUNT]");
    AccountLabel accountLabel = AccountLabel.newBuilder().build();

    AccountLabel actualResponse = client.createAccountLabel(parent, accountLabel);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createAccountLabelExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      AccountName parent = AccountName.of("[ACCOUNT]");
      AccountLabel accountLabel = AccountLabel.newBuilder().build();
      client.createAccountLabel(parent, accountLabel);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAccountLabelTest2() throws Exception {
    AccountLabel expectedResponse =
        AccountLabel.newBuilder()
            .setName(AccountLabelName.of("[ACCOUNT]", "[LABEL]").toString())
            .setLabelId(-1959256506)
            .setAccountId(-803333011)
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "accounts/account-4811";
    AccountLabel accountLabel = AccountLabel.newBuilder().build();

    AccountLabel actualResponse = client.createAccountLabel(parent, accountLabel);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createAccountLabelExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "accounts/account-4811";
      AccountLabel accountLabel = AccountLabel.newBuilder().build();
      client.createAccountLabel(parent, accountLabel);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateAccountLabelTest() throws Exception {
    AccountLabel expectedResponse =
        AccountLabel.newBuilder()
            .setName(AccountLabelName.of("[ACCOUNT]", "[LABEL]").toString())
            .setLabelId(-1959256506)
            .setAccountId(-803333011)
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .build();
    mockService.addResponse(expectedResponse);

    AccountLabel accountLabel =
        AccountLabel.newBuilder()
            .setName(AccountLabelName.of("[ACCOUNT]", "[LABEL]").toString())
            .setLabelId(-1959256506)
            .setAccountId(-803333011)
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .build();

    AccountLabel actualResponse = client.updateAccountLabel(accountLabel);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateAccountLabelExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      AccountLabel accountLabel =
          AccountLabel.newBuilder()
              .setName(AccountLabelName.of("[ACCOUNT]", "[LABEL]").toString())
              .setLabelId(-1959256506)
              .setAccountId(-803333011)
              .setDisplayName("displayName1714148973")
              .setDescription("description-1724546052")
              .build();
      client.updateAccountLabel(accountLabel);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAccountLabelTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    AccountLabelName name = AccountLabelName.of("[ACCOUNT]", "[LABEL]");

    client.deleteAccountLabel(name);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteAccountLabelExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      AccountLabelName name = AccountLabelName.of("[ACCOUNT]", "[LABEL]");
      client.deleteAccountLabel(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAccountLabelTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    String name = "accounts/account-9437/labels/label-9437";

    client.deleteAccountLabel(name);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteAccountLabelExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "accounts/account-9437/labels/label-9437";
      client.deleteAccountLabel(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
