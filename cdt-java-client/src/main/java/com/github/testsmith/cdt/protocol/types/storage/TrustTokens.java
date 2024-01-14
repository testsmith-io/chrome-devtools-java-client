package com.github.testsmith.cdt.protocol.types.storage;

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

/**
 * Pair of issuer origin and number of available (signed, but not used) Trust Tokens from that
 * issuer.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class TrustTokens {

  private String issuerOrigin;

  private Double count;

  /**
   * Getter for the field <code>issuerOrigin</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getIssuerOrigin() {
    return issuerOrigin;
  }

  /**
   * Setter for the field <code>issuerOrigin</code>.
   *
   * @param issuerOrigin a {@link java.lang.String} object
   */
  public void setIssuerOrigin(String issuerOrigin) {
    this.issuerOrigin = issuerOrigin;
  }

  /**
   * Getter for the field <code>count</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getCount() {
    return count;
  }

  /**
   * Setter for the field <code>count</code>.
   *
   * @param count a {@link java.lang.Double} object
   */
  public void setCount(Double count) {
    this.count = count;
  }
}
