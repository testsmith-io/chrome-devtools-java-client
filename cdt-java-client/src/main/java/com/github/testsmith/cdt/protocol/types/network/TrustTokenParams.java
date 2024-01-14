package com.github.testsmith.cdt.protocol.types.network;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2024 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import java.util.List;

/**
 * Determines what type of Trust Token operation is executed and depending on the type, some
 * additional parameters. The values are specified in
 * third_party/blink/renderer/core/fetch/trust_token.idl.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class TrustTokenParams {

  private TrustTokenOperationType type;

  private TrustTokenParamsRefreshPolicy refreshPolicy;

  @Optional private List<String> issuers;

  /**
   * Getter for the field <code>type</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.TrustTokenOperationType}
   *     object
   */
  public TrustTokenOperationType getType() {
    return type;
  }

  /**
   * Setter for the field <code>type</code>.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.network.TrustTokenOperationType}
   *     object
   */
  public void setType(TrustTokenOperationType type) {
    this.type = type;
  }

  /**
   * Only set for "token-redemption" type and determine whether to request a fresh SRR or use a
   * still valid cached SRR.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.TrustTokenParamsRefreshPolicy}
   *     object
   */
  public TrustTokenParamsRefreshPolicy getRefreshPolicy() {
    return refreshPolicy;
  }

  /**
   * Only set for "token-redemption" type and determine whether to request a fresh SRR or use a
   * still valid cached SRR.
   *
   * @param refreshPolicy a {@link
   *     com.github.testsmith.cdt.protocol.types.network.TrustTokenParamsRefreshPolicy} object
   */
  public void setRefreshPolicy(TrustTokenParamsRefreshPolicy refreshPolicy) {
    this.refreshPolicy = refreshPolicy;
  }

  /**
   * Origins of issuers from whom to request tokens or redemption records.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getIssuers() {
    return issuers;
  }

  /**
   * Origins of issuers from whom to request tokens or redemption records.
   *
   * @param issuers a {@link java.util.List} object
   */
  public void setIssuers(List<String> issuers) {
    this.issuers = issuers;
  }
}