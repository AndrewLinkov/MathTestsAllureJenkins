package tests.suit;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static tests.interfaces.INameTags.DIVISION;

/**
��� ������� ������������� ������ ������, �������� �������� ����� � ��������� @IncludeTags.

 �������� ��������� ������ ������, ��������� ���������� ����������: @IncludeTags({SMOKE})
 **/

@Suite
@IncludeTags({DIVISION})
@SelectPackages({"mathTests"})
public class RunTests {
}
