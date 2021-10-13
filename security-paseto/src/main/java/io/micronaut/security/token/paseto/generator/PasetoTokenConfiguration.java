/*
 * Copyright 2017-2020 original authors
 *
 *  Licensed under the Apache License, Version 2.0 \(the "License"\);
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.micronaut.security.token.paseto.generator;

import dev.paseto.jpaseto.Purpose;
import dev.paseto.jpaseto.Version;

import javax.crypto.SecretKey;

/**
 * @author Utsav Varia
 * @since 3.0
 */
public interface PasetoTokenConfiguration {

    /**
     * @return Paseto Version
     */
    default Version getVersion() {
        return Version.V1;
    }

    default Purpose getPurpose() {
        return Purpose.LOCAL;
    }

    default SecretKey getSecretKey() {
        return null;
    }

}
