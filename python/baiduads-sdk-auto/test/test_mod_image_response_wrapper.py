"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.imagemanage.model.mod_image_response_wrapper_body import ModImageResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['ModImageResponseWrapperBody'] = ModImageResponseWrapperBody
from baiduads.imagemanage.model.mod_image_response_wrapper import ModImageResponseWrapper


class TestModImageResponseWrapper(unittest.TestCase):
    """ModImageResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testModImageResponseWrapper(self):
        """Test ModImageResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ModImageResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
