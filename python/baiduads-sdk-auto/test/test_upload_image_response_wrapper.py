"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.imagemanagement.model.upload_image_response_wrapper_body import UploadImageResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['UploadImageResponseWrapperBody'] = UploadImageResponseWrapperBody
from baiduads.imagemanagement.model.upload_image_response_wrapper import UploadImageResponseWrapper


class TestUploadImageResponseWrapper(unittest.TestCase):
    """UploadImageResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUploadImageResponseWrapper(self):
        """Test UploadImageResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UploadImageResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
