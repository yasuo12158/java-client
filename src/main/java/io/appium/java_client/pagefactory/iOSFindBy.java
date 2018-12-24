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
 * Used to mark a field on a Page Object to indicate an alternative mechanism for locating the
 * element or a list of elements. Used in conjunction with
 * {@link org.openqa.selenium.support.PageFactory}
 * this allows users to quickly and easily create PageObjects.
 * using iOS UI selectors, accessibility, id, name, class name, tag and xpath
 *
 * @deprecated UIAutomation is going to get deprecated.
 *      Use {@link iOSXCUITFindBy} instead
 *      It is recommended to use XCUITest
 */
@Retention(RUNTIME)
@Target({FIELD, TYPE})
@Repeatable(iOSFindBySet.class)
public @interface iOSFindBy {
    /**
     * It is an iOS UIAutomation string.
     * Read https://developer.apple.com/library/tvos/documentation/DeveloperTools/
     * Conceptual/InstrumentsUserGuide/UIAutomation.html
     *
     * @return an iOS UIAutomation string
     */
    String uiAutomator() default "";

    /**
     * It an UI automation accessibility Id which is a convenient to iOS.
     * About iOS accessibility
     * See  <a href="https://goo.gl/7sEkoB">UIAccessibilityIdentification</a>
     *
     * @return an UI automation accessibility Id
     */
    String accessibility() default "";

    /**
     * It is an id of the target element.
     *
     * @return an id of the target element
     */
    String id() default "";

    /**
     * It is a name of a type/class of the target element.
     *
     * @return a name of a type/class of the target element
     */
    String className() default "";

    /**
     * It is a desired element tag.
     *
     * @return a desired element tag
     */
    String tagName() default "";

    /**
     * It is a xpath to the target element.
     *
     * @return a xpath to the target element
     */
    String xpath() default "";

    /**
     * Priority of the searching. Higher number means lower priority.
     *
     * @return priority of the searching
     */
    int priority() default 0;
}
