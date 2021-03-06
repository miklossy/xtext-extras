/**
 * Copyright (c) 2013, 2016 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.resource.uriHell;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.uriHell.LoadedByClasspathFromSourceFolderTest;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class LoadedByClasspathFromSourceFolderTest2 extends LoadedByClasspathFromSourceFolderTest {
  @Override
  public URI getResourceURI() {
    return URI.createURI("platform:/resource/org.eclipse.xtext.tests/src/org/eclipse/xtext/resource/ecore/utf8.ecore");
  }
  
  @Override
  public URI getPackagedResourceURI() {
    return URI.createURI("classpath:/org/eclipse/xtext/resource/ecore/utf8.ecore");
  }
}
