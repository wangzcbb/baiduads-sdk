"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.dpacreativefeed.model.extra_picture import ExtraPicture
from baiduads.dpacreativefeed.model.picture import Picture
globals()['ExtraPicture'] = ExtraPicture
globals()['Picture'] = Picture
from baiduads.dpacreativefeed.model.template import Template


class TestTemplate(unittest.TestCase):
    """Template unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testTemplate(self):
        """Test Template"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Template()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
