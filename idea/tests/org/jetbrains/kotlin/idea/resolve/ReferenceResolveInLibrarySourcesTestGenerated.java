/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/resolve/referenceInLib")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ReferenceResolveInLibrarySourcesTestGenerated extends AbstractReferenceResolveInLibrarySourcesTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInReferenceInLib() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/resolve/referenceInLib"), Pattern.compile("^(.+)\\.kt$"), false);
    }

    @TestMetadata("builtInNumber.kt")
    public void testBuiltInNumber() throws Exception {
        runTest("idea/testData/resolve/referenceInLib/builtInNumber.kt");
    }

    @TestMetadata("inLibrarySource.kt")
    public void testInLibrarySource() throws Exception {
        runTest("idea/testData/resolve/referenceInLib/inLibrarySource.kt");
    }

    @TestMetadata("toFunParameter.kt")
    public void testToFunParameter() throws Exception {
        runTest("idea/testData/resolve/referenceInLib/toFunParameter.kt");
    }

    @TestMetadata("toLocalFun.kt")
    public void testToLocalFun() throws Exception {
        runTest("idea/testData/resolve/referenceInLib/toLocalFun.kt");
    }
}
