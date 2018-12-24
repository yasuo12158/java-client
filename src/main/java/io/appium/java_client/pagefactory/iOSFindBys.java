/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appium.java_client.pagefactory;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Used to mark a field on a Page Object to indicate that lookup should use
 * a series of {@link io.appium.java_client.pagefactory.iOSBy} tags.
 *
 * @deprecated UIAutomation is going to get deprecated.
 *      Use {@link iOSXCUITFindBys} instead
 *      It is recommended to use XCUITest
 */
@Retention(RUNTIME)
@Target({FIELD, TYPE})
@Repeatable(iOSFindByChainSet.class)
public @interface iOSFindBys {
    /**
     * It is a set of {@link iOSBy} strategies which build the chain of the searching for the target element.
     *
     * @return a collection of strategies which build the chain of the searching for the target element
     */
    iOSBy[] value();

    /**
     * Priority of the searching. Higher number means lower priority.
     *
     * @return priority of the searching
     */
    int priority() default 0;
}
