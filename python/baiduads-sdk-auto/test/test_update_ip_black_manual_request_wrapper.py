"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.shieldfunction.model.update_ip_black_manual_request import UpdateIPBlackManualRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['UpdateIPBlackManualRequest'] = UpdateIPBlackManualRequest
from baiduads.shieldfunction.model.update_ip_black_manual_request_wrapper import UpdateIPBlackManualRequestWrapper


class TestUpdateIPBlackManualRequestWrapper(unittest.TestCase):
    """UpdateIPBlackManualRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateIPBlackManualRequestWrapper(self):
        """Test UpdateIPBlackManualRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateIPBlackManualRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
