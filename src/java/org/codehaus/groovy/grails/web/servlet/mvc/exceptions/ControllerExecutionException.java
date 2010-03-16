/*
 * Copyright 2004-2005 the original author or authors.
 *
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
 */
package org.codehaus.groovy.grails.web.servlet.mvc.exceptions;

/**
 * Throw when an exception occurs during controller execution
 *
 * @author Graeme Rocher
 * @since 0.2
 *
 * Created Oct 27, 2005
 */

public class ControllerExecutionException extends GrailsMVCException {

	private static final long serialVersionUID = 4625710641559921836L;

	public ControllerExecutionException() {
		super();
	}

	public ControllerExecutionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ControllerExecutionException(String arg0) {
		super(arg0);
	}

	public ControllerExecutionException(Throwable arg0) {
		super(arg0);
	}

}
