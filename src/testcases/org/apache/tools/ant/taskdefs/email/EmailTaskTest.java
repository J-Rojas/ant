/*
 * Copyright  2003-2004 Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.tools.ant.taskdefs.email;

import org.apache.tools.ant.BuildFileTest;

/**
 * TODO : develop these testcases - the email task needs to have attributes allowing
 * to simulate sending mail and to catch the output in text files or streams
 * @author <a href="mailto:levylambert@tiscali-dsl.de">Antoine Levy-Lambert</a>
 */
public class EmailTaskTest extends BuildFileTest {

    public EmailTaskTest(String name) {
        super(name);
    }

    public void setUp() {
        configureProject("src/etc/testcases/taskdefs/email/mail.xml");
    }

    public void test1() {
        expectBuildException("test1", "SMTP auth only possible with MIME mail");
    }

    public void test2() {
        expectBuildException("test2", "SSL only possible with MIME mail");
    }

}
