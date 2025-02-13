/*
   Copyright 2021-2023 WeAreFrank!

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package nl.nn.adapterframework.lifecycle;

import org.springframework.context.Lifecycle;

import nl.nn.adapterframework.configuration.ConfigurationException;

/**
 * Interface for Spring beans that require their Lifecycle to be managed by Spring.
 * See {@link ConfiguringLifecycleProcessor}
 * 
 * @author Niels
 */
public interface ConfigurableLifecycle extends Lifecycle {

	/**
	 * Configure this component.
	 * <p>In the case of a container, this will propagate the start signal to all
	 * components that apply.</p>
	 * @throws ConfigurationException in case it was not able to configure the component.
	 */
	public void configure() throws ConfigurationException;
}
