"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.accountfeed.model.update_account_feed_request_wrapper_body import UpdateAccountFeedRequestWrapperBody
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['UpdateAccountFeedRequestWrapperBody'] = UpdateAccountFeedRequestWrapperBody
from baiduads.accountfeed.model.update_account_feed_request_wrapper import UpdateAccountFeedRequestWrapper


class TestUpdateAccountFeedRequestWrapper(unittest.TestCase):
    """UpdateAccountFeedRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateAccountFeedRequestWrapper(self):
        """Test UpdateAccountFeedRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateAccountFeedRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
