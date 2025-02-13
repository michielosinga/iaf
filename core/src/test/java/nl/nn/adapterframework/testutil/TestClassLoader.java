package nl.nn.adapterframework.testutil;

import java.net.URL;

import nl.nn.adapterframework.configuration.ClassLoaderException;
import nl.nn.adapterframework.configuration.IbisContext;
import nl.nn.adapterframework.configuration.classloaders.ClassLoaderBase;

public class TestClassLoader extends ClassLoaderBase {

	public TestClassLoader(ClassLoader parent) {
		super(parent);
	}

	@Override
	public void configure(IbisContext ibisContext, String configurationName) throws ClassLoaderException {
		if("ConfigWithNullClassLoader".equals(configurationName)) {
			setReportLevel("INFO");
			throw new ClassLoaderException("test-exception");
		}

		super.configure(ibisContext, configurationName);
	}

	@Override
	public URL getLocalResource(String name) {
		if("SpringConfigurationContext.xml".equals(name)) {
			throw new IllegalStateException("unable to instantiate this Spring context!");
		}
		return null;
	}

}
