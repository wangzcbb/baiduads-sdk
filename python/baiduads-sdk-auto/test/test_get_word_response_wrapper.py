"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.keyword.model.add_word_response_wrapper_body import AddWordResponseWrapperBody
globals()['AddWordResponseWrapperBody'] = AddWordResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
from baiduads.keyword.model.get_word_response_wrapper import GetWordResponseWrapper


class TestGetWordResponseWrapper(unittest.TestCase):
    """GetWordResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetWordResponseWrapper(self):
        """Test GetWordResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetWordResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
